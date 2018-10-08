import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';


const appRoutes: Routes = [
  {
    path: 'homepage',
    component: HomePageComponent
  },
  { path: '',
    redirectTo: '/homepage',
    pathMatch: 'full'
  }
];


@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent
  ],
  imports: [
    RouterModule.forRoot(
      appRoutes
    ),
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
