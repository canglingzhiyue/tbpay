package org.webrtc.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import mtopsdk.network.impl.ResponseProtocolType;
import org.webrtc.Logging;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public final class WebRtcAudioUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WebRtcAudioUtilsExternal";

    static {
        kge.a(722823640);
    }

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

    public static String modeToString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d95e98b3", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    private static String streamTypeToString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("531637aa", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
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

    public static void logDeviceInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08e3b19", new Object[]{str});
            return;
        }
        Logging.d(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    public static void logAudioState(String str, Context context, AudioManager audioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9cb7a5", new Object[]{str, context, audioManager});
            return;
        }
        logDeviceInfo(str);
        logAudioStateBasic(str, context, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, Context context, AudioManager audioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25eefb5", new Object[]{str, context, audioManager});
            return;
        }
        Logging.d(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone(context) + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
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

    private static boolean hasMicrophone(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("49c2b841", new Object[]{context})).booleanValue() : context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }
}
