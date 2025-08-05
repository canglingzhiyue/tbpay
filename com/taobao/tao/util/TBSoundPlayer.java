package com.taobao.tao.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.Settings;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Global;
import com.taobao.taobao.R;
import com.taobao.uikit.utils.SoundPlayer;
import java.util.HashMap;
import tb.kge;
import tb.shc;

/* loaded from: classes.dex */
public class TBSoundPlayer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SETTINGS_SYSTEM_MESSAGE_SOUND = "systemMessageSound";
    private static final String SETTINGS_SYSTEM_SOUND = "systemSound";
    private static TBSoundPlayer _INSTANCE;
    private static boolean sOnlineConfig;
    private static HashMap sSceneConfigMap;
    private boolean mEnable = true;
    private boolean mMessageEnable = true;
    private boolean mIsTouchSoundsEnabled = false;
    private Context mContext = Global.getContext();
    private SoundPlayer mRealPlayer = SoundPlayer.getInstance(this.mContext);

    /* loaded from: classes8.dex */
    public static class Scene {
        public static final int CART = 4;
        public static final int FAVORITE = 3;
        public static final int LIKE = 5;
        public static final int PAY = 6;
        public static final int PUBLISH = 7;
        public static final int PUSH = 0;
        public static final int REFRESH = 2;
        public static final int TAP = 1;

        static {
            kge.a(-1335765315);
        }
    }

    static {
        kge.a(-2094689355);
        sOnlineConfig = true;
        sSceneConfigMap = new HashMap<Integer, String>() { // from class: com.taobao.tao.util.TBSoundPlayer.1
            {
                put(0, "message");
                put(1, shc.SCENE_TAP);
                put(2, "pullRefresh");
                put(3, "favorite");
                put(4, "cart");
                put(5, "like");
                put(6, "page");
                put(7, "page");
            }
        };
    }

    public static TBSoundPlayer getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSoundPlayer) ipChange.ipc$dispatch("6de4fa2e", new Object[0]);
        }
        if (_INSTANCE == null) {
            synchronized (TBSoundPlayer.class) {
                _INSTANCE = new TBSoundPlayer();
            }
        }
        return _INSTANCE;
    }

    private TBSoundPlayer() {
        this.mRealPlayer.register(0, R.raw.sound_push);
        this.mRealPlayer.register(1, R.raw.sound_tap);
        this.mRealPlayer.register(2, R.raw.sound_refresh);
        this.mRealPlayer.register(3, R.raw.sound_favorite);
        this.mRealPlayer.register(5, R.raw.sound_like);
        this.mRealPlayer.register(6, R.raw.sound_page_success);
        this.mRealPlayer.register(4, R.raw.sound_add_to_cart);
        this.mRealPlayer.register(7, R.raw.sound_page_success);
    }

    public static void setOnlineConfig(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88aa5896", new Object[]{new Boolean(z)});
        } else {
            sOnlineConfig = z;
        }
    }

    public void play(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d41d4a8", new Object[]{this, new Integer(i)});
        } else if (!shouldPlaySound()) {
        } else {
            this.mRealPlayer.play(i);
        }
    }

    public void play(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f858a6c5", new Object[]{this, str});
        } else if (!shouldPlaySound()) {
        } else {
            this.mRealPlayer.play(str);
        }
    }

    public void playScene(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab6d4a4", new Object[]{this, new Integer(i)});
        } else if (!shouldPlayScene(i)) {
        } else {
            this.mRealPlayer.playScene(i);
        }
    }

    public boolean shouldPlaySound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ec5253", new Object[]{this})).booleanValue();
        }
        Context context = this.mContext;
        if (context == null) {
            return sOnlineConfig;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains("systemSound")) {
            this.mEnable = defaultSharedPreferences.getBoolean("systemSound", true);
            return this.mEnable;
        }
        return sOnlineConfig;
    }

    public boolean shouldPlayScene(int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("660b413b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Context context = this.mContext;
        if (context == null) {
            return sOnlineConfig;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        boolean contains = defaultSharedPreferences.contains("systemSound");
        if (contains) {
            this.mEnable = defaultSharedPreferences.getBoolean("systemSound", true);
        }
        this.mMessageEnable = defaultSharedPreferences.getBoolean(SETTINGS_SYSTEM_MESSAGE_SOUND, true);
        this.mIsTouchSoundsEnabled = Settings.System.getInt(this.mContext.getContentResolver(), "sound_effects_enabled", 1) != 0;
        if (i == 0) {
            return this.mMessageEnable;
        }
        if (contains) {
            z = this.mEnable;
        } else {
            z = sOnlineConfig;
        }
        return (!z || !this.mIsTouchSoundsEnabled) ? z : i == 2 || i == 7;
    }

    public Object getSound(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("422e31ef", new Object[]{this, new Integer(i)}) : this.mRealPlayer.getSound(i);
    }

    public void updateSound(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122afbb2", new Object[]{this, new Integer(i), obj});
        } else if (obj instanceof Integer) {
            this.mRealPlayer.register(i, ((Integer) obj).intValue());
        } else if (!(obj instanceof String)) {
        } else {
            this.mRealPlayer.register(i, (String) obj);
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.mRealPlayer.release();
        }
    }

    public static HashMap<Integer, String> getConfigMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("25ce72e", new Object[0]) : sSceneConfigMap;
    }
}
