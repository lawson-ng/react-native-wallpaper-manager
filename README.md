# React Native Wallpaper Manager 🚀

## Installation

```sh
npm install react-native-wallpaper-manage

# OR

yarn install react-native-wallpaper-manage
```

## Usage

```js
import WallpaperManager, {TYPE} from "react-native-wallpaper-manager";

// ...

const result = WallpaperManager.setWallpaper(URL, TYPE.FLAG_LOCK)
```
## Properties

#### Basic

| Prop           |     Default     |   Type   | Description                                                                                                 |
| :------------- | :-------------: | :------: | :---------------------------------------------------------------------------------------------------------- |
| TYPE           |  FLAG_SYSTEM    |  `enum`  | `FLAG_LOCK`: the lock-screen-specific wallpaper. `FLAG_SYSTEM`: the system wallpaper.                       |


## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT
