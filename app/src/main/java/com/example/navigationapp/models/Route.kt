package com.example.navigationapp.models

interface Route {
    val route: String
}


//Bottom tabs
object Home: Route {
    override val route = "Home"
}

object NewBooking:Route{
    override val route = "NewBooking"
}

object Notifications:Route{
    override val route = "Notifications"
}


//Drawer
object NearbyOperators:Route{
    override val route = "NearbyOperators"
}
object ViewLayout:Route{
    override val route = "ViewLayout"
}
object Settings:Route{
    override val route = "Settings"
}
object Logout:Route{
    override val route = "Logout"
}