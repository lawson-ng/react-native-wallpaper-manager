import { NativeModules } from 'react-native';

type WallpaperManagerType = {
  setWallpaper(url: string, type: number): Promise<string>;
};

type Type = {
  FLAG_LOCK: number;
  FLAG_SYSTEM: number;
};

const { WallpaperManager } = NativeModules;

export const TYPE: Type = WallpaperManager.getConstants();

export default WallpaperManager as WallpaperManagerType;
