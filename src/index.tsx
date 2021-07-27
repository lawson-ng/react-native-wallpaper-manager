import { NativeModules } from 'react-native';

type WallpaperManagerType = {
  setWallpaper(url: string, type: number): Promise<number>;
};

const { WallpaperManager } = NativeModules;

export default WallpaperManager as WallpaperManagerType;
