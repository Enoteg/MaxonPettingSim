package com.ilotterytea.maxoning;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.ilotterytea.maxoning.utils.OsUtils;

public class MaxonConstants {
    public static final String GAME_NAME = "Maxon Petting Simulator";
    public static final String GAME_VERSION = "Alpha 1.1.2";
    public static final String GAME_GHTAG = "alpha-1.1.2";
    public static final String GAME_PUBLISHER = "iLotterytea";

    public static final String GAME_MAIN_FOLDER = OsUtils.getUserDataDirectory(".Maxoning");
    public static final String GAME_SCREENSHOT_FOLDER = GAME_MAIN_FOLDER + "/screenshots";
    public static final String GAME_SAVEGAME_FOLDER = GAME_MAIN_FOLDER + "/savegames";

    public static final FileHandle FILE_EN_US = Gdx.files.internal("i18n/en_us.json");
    public static final FileHandle FILE_RU_RU = Gdx.files.internal("i18n/ru_ru.json");
}
