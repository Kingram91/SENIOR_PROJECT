//
//  RearViewController.m
//  EventFoundry
//
//  Created by Kquane-David Ingram on 10/30/14.
//  Copyright (c) 2014 KING. All rights reserved.
//


#import "SidebarViewController.h"
#import "SWRevealViewController.h"
#import "DiscoveryViewController.h"
#import "MyEventsViewController.h"
#import "MyTicketsViewController.h"

@interface SidebarViewController()

@end

@implementation SidebarViewController{
    NSArray *menuItems;
}


#pragma mark - View lifecycle

- (id)initWithStyle:(UITableViewStyle)style
{
    self = [super initWithStyle:style];
    if (self) {
        // Custom initialization
    }
    return self;
}

- (void)viewDidLoad
{
    [super viewDidLoad];
    
    menuItems = @[@"title", @"discover", @"myTickets", @"myEvents", @"login or Signup", @"settings"];
}

-(void)didReceiveMemoryWarning{
    [super didReceiveMemoryWarning];
}


#pragma marl - UITableView Data Source

- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView{
    return 1;
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
{
    return [menuItems count];
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
    NSString *CellIdentifier = [menuItems objectAtIndex:indexPath.row];
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier forIndexPath:indexPath];
    
    return cell;
}

- (void) prepareForSegue: (UIStoryboardSegue *) segue sender: (id) sender
{
    // Set the title of navigation bar by using the menu items
    NSIndexPath *indexPath = [self.tableView indexPathForSelectedRow];
    UINavigationController *destViewController = (UINavigationController*)segue.destinationViewController;
    destViewController.title = [[menuItems objectAtIndex:indexPath.row] capitalizedString];
    
    // load the My Tickets View Controller if it navigates to the myTicketsViewController
    if ([segue.identifier isEqualToString:@"tickets"]) {
        
        //Load from Database
        
        MyTicketsViewController *ticketsViewController = (MyTicketsViewController*)segue.destinationViewController;
    }
    else if ([segue.identifier isEqualToString:@"myeventsSegue"]){
        //Load from Database User Saved Events
        
    }else if ([segue.identifier isEqualToString:@"settingsSegue"]){
        //Load settings ??        
    }else if ([segue.identifier isEqualToString:@"loginSegue"]){
        //Do something with the login information
        
    }
    
    
    if ( [segue isKindOfClass: [SWRevealViewControllerSegue class]] ) {
        SWRevealViewControllerSegue *swSegue = (SWRevealViewControllerSegue*) segue;
        
        swSegue.performBlock = ^(SWRevealViewControllerSegue* rvc_segue, UIViewController* svc, UIViewController* dvc) {
            
            UINavigationController* navController = (UINavigationController*)self.revealViewController.frontViewController;
            [navController setViewControllers: @[dvc] animated: NO ];
            [self.revealViewController setFrontViewPosition: FrontViewPositionLeft animated: YES];
        };
        
    }
}

@end