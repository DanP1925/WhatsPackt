# WhatsPackt Copy

This project is a copy of WhatsPack from the
book [Thriving in Android Development using Kotlin](https://www.packtpub.com/en-in/product/thriving-in-android-development-using-kotlin-9781837631292).

## Modules

It uses a mix of modulization based on features and modulization based on layers. 

The modules are: 

- **:app** : To join all the features and general configuration
- **:feature:conversations**: For a list of all chats 
- **:feature:chat**: For the detail of a chat 
- **:feature:create_chat**: For creating a new chat
- **:common:domain**: For the business logic that will be implemented by use cases
- **:common:data**: For the data layer which will interact with data sources
- **:common:framework**: For the code that depends on the android framework

## Libraries

- [Dagger Hilt](https://developer.android.com/training/dependency-injection/hilt-android) : For dependency injection
- [Navigation 3](https://developer.android.com/guide/navigation/navigation-3) : For navigation between screens
- [Material 3](https://m3.material.io/): As the design system library
