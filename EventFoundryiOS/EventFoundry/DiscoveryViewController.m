//
//  ViewController.m
//  EventFoundry
//
//  Created by Kquane Ingram on 10/27/14.
//  Copyright (c) 2014 KING. All rights reserved.
//

#import "DiscoveryViewController.h"
#import "SWRevealViewController.h"

@interface DiscoveryViewController ()

@end

@implementation DiscoveryViewController

#pragma mark - View lifecycle


- (void)viewDidLoad
{
    [super viewDidLoad];
    
    self.title = @"Discover";
    
    // Change button color
    _sidebarButton.tintColor = [UIColor colorWithWhite:0.1f alpha:0.9f];
    
    // Set the side bar button action. When it's tapped, it'll show up the sidebar.
    _sidebarButton.target = self.revealViewController;
    _sidebarButton.action = @selector(revealToggle:);
    
    // Set the gesture
    [self.view addGestureRecognizer:self.revealViewController.panGestureRecognizer];
    
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
