package org.webrtc.voiceengine;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import mtopsdk.network.impl.ResponseProtocolType;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public final class WebRtcAudioUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String[] BLACKLISTED_AEC_MODELS;
    private static final String[] BLACKLISTED_NS_MODELS;
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final String TAG = "WebRtcAudioUtils";
    private static int defaultSampleRateHz;
    private static boolean isDefaultSampleRateOverridden;
    private static boolean useWebRtcBasedAcousticEchoCanceler;
    private static boolean useWebRtcBasedNoiseSuppressor;

    private static String deviceTypeToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6e8d100", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 0:
                return "TYPE_UNKNOWN";
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static boolean isAutomaticGainControlSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7786cb3c", new Object[0])).booleanValue();
        }
        return false;
    }

    public static String modeToString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d95e98b3", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    private static String streamTypeToString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("531637aa", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    static {
        kge.a(-1257989574);
        BLACKLISTED_OPEN_SL_ES_MODELS = new String[]{"PCHM10", "PCHM30", "PDAM10"};
        BLACKLISTED_AEC_MODELS = new String[0];
        BLACKLISTED_NS_MODELS = new String[0];
        defaultSampleRateHz = DEFAULT_SAMPLE_RATE_HZ;
        isDefaultSampleRateOverridden = false;
        useWebRtcBasedAcousticEchoCanceler = false;
        useWebRtcBasedNoiseSuppressor = false;
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("585b5f1a", new Object[]{new Boolean(z)});
            } else {
                useWebRtcBasedAcousticEchoCanceler = z;
            }
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb91ff", new Object[]{new Boolean(z)});
            } else {
                useWebRtcBasedNoiseSuppressor = z;
            }
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc7b0e36", new Object[]{new Boolean(z)});
            } else {
                Logging.w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
            }
        }
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        synchronized (WebRtcAudioUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("113a2fb9", new Object[0])).booleanValue();
            }
            if (useWebRtcBasedAcousticEchoCanceler) {
                Logging.w(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
            return useWebRtcBasedAcousticEchoCanceler;
        }
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        synchronized (WebRtcAudioUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ead649de", new Object[0])).booleanValue();
            }
            if (useWebRtcBasedNoiseSuppressor) {
                Logging.w(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
            return useWebRtcBasedNoiseSuppressor;
        }
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a91a2d1d", new Object[0])).booleanValue();
            }
            return true;
        }
    }

    public static boolean isAcousticEchoCancelerSupported() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a309f820", new Object[0])).booleanValue() : WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isNoiseSuppressorSupported() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55264791", new Object[0])).booleanValue() : WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    public static synchronized void setDefaultSampleRateHz(int i) {
        synchronized (WebRtcAudioUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22d9aec1", new Object[]{new Integer(i)});
                return;
            }
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i;
        }
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        synchronized (WebRtcAudioUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e192560", new Object[0])).booleanValue();
            }
            return isDefaultSampleRateOverridden;
        }
    }

    public static synchronized int getDefaultSampleRateHz() {
        synchronized (WebRtcAudioUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b1216f01", new Object[0])).intValue();
            }
            return defaultSampleRateHz;
        }
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("70246885", new Object[0]) : Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("37a0e49d", new Object[0]) : Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static boolean runningOnJellyBeanMR1OrHigher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("58aeaa19", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 17;
    }

    public static boolean runningOnJellyBeanMR2OrHigher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4731b09a", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 18;
    }

    public static boolean runningOnLollipopOrHigher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a6b23e6", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 21;
    }

    public static boolean runningOnMarshmallowOrHigher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("487aadce", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 23;
    }

    public static boolean runningOnNougatOrHigher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f071c61", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 24;
    }

    public static boolean runningOnOreoOrHigher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d217a3a8", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 26;
    }

    public static boolean runningOnOreoMR1OrHigher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6ea241e", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 27;
    }

    public static String getThreadInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("846c71eb", new Object[0]);
        }
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + riy.ARRAY_END_STR;
    }

    public static boolean runningOnEmulator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b74983e", new Object[0])).booleanValue() : Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f37632e", new Object[0])).booleanValue() : Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    public static void logDeviceInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08e3b19", new Object[]{str});
            return;
        }
        Logging.d(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    public static void logAudioState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b1fa10", new Object[]{str});
            return;
        }
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae8fed", new Object[]{str, audioManager});
            return;
        }
        Logging.d(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone() + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cc8f77", new Object[]{str, audioManager});
            return;
        }
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        if (runningOnLollipopOrHigher()) {
            z = audioManager.isVolumeFixed();
            Logging.d(str, "  fixed volume=" + z);
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        for (int i : iArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("  " + streamTypeToString(i) + ResponseProtocolType.COMMENT);
            sb.append("volume=");
            sb.append(audioManager.getStreamVolume(i));
            sb.append(", max=");
            sb.append(audioManager.getStreamMaxVolume(i));
            logIsStreamMute(str, audioManager, i, sb);
            Logging.d(str, sb.toString());
        }
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b36e56d", new Object[]{str, audioManager, new Integer(i), sb});
        } else if (!runningOnMarshmallowOrHigher()) {
        } else {
            sb.append(", muted=");
            sb.append(audioManager.isStreamMute(i));
        }
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3426a34", new Object[]{str, audioManager});
        } else if (runningOnMarshmallowOrHigher()) {
            AudioDeviceInfo[] devices = audioManager.getDevices(3);
            if (devices.length == 0) {
                return;
            }
            Logging.d(str, "Audio Devices: ");
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                StringBuilder sb = new StringBuilder();
                sb.append("  ");
                sb.append(deviceTypeToString(audioDeviceInfo.getType()));
                sb.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
                if (audioDeviceInfo.getChannelCounts().length > 0) {
                    sb.append("channels=");
                    sb.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                    sb.append(", ");
                }
                if (audioDeviceInfo.getEncodings().length > 0) {
                    sb.append("encodings=");
                    sb.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                    sb.append(", ");
                }
                if (audioDeviceInfo.getSampleRates().length > 0) {
                    sb.append("sample rates=");
                    sb.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                    sb.append(", ");
                }
                sb.append("id=");
                sb.append(audioDeviceInfo.getId());
                Logging.d(str, sb.toString());
            }
        }
    }

    private static boolean hasMicrophone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("544641ef", new Object[0])).booleanValue() : ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }
}
