package tb;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/android/megautils/NfcUtils;", "", "()V", "HEX_ARRAY", "", "bigBytesToHex", "", "bytes", "", "getNfcTechnology", "technologyName", "isSupportNfc", "", "context", "Landroid/content/Context;", "littleBytesToHex", "nfcIsOpen", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class hsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hsx INSTANCE = new hsx();

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f28766a;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        q.b(charArray, "(this as java.lang.String).toCharArray()");
        f28766a = charArray;
    }

    private hsx() {
    }

    public final String a(byte[] bytes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{this, bytes});
        }
        q.d(bytes, "bytes");
        char[] cArr = new char[(bytes.length * 3) - 1];
        int length = bytes.length;
        while (true) {
            length--;
            if (length >= 0) {
                int i = bytes[length] & 255;
                char[] cArr2 = f28766a;
                cArr[((bytes.length - 1) - length) * 3] = cArr2[i >>> 4];
                cArr[(((bytes.length - 1) - length) * 3) + 1] = cArr2[i & 15];
                if (length > 0) {
                    cArr[(((bytes.length - 1) - length) * 3) + 2] = riy.CONDITION_IF_MIDDLE;
                }
            } else {
                return new String(cArr);
            }
        }
    }

    public final String b(byte[] bytes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47058030", new Object[]{this, bytes});
        }
        q.d(bytes, "bytes");
        char[] cArr = new char[(bytes.length * 3) - 1];
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            int i2 = bytes[i] & 255;
            int i3 = i * 3;
            char[] cArr2 = f28766a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
            if (i < bytes.length - 1) {
                cArr[i3 + 2] = riy.CONDITION_IF_MIDDLE;
            }
        }
        return new String(cArr);
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1288598210:
                    if (str.equals("android.nfc.tech.NdefFormatable")) {
                        return "NdefFormatable";
                    }
                    break;
                case -1244773491:
                    if (str.equals("android.nfc.tech.Ndef")) {
                        return "NDEF";
                    }
                    break;
                case -1244771668:
                    if (str.equals("android.nfc.tech.NfcA")) {
                        return "ISO 14443-3A";
                    }
                    break;
                case -1244771667:
                    if (str.equals("android.nfc.tech.NfcB")) {
                        return "ISO 14443-3B";
                    }
                    break;
                case -1244771663:
                    if (str.equals("android.nfc.tech.NfcF")) {
                        return "JIS 6319-4";
                    }
                    break;
                case -1244771647:
                    if (str.equals("android.nfc.tech.NfcV")) {
                        return "ISO 15693";
                    }
                    break;
                case 1401013770:
                    if (str.equals("android.nfc.tech.MifareUltralight")) {
                        return "MifareUltralight";
                    }
                    break;
                case 1456803698:
                    if (str.equals("android.nfc.tech.MifareClassic")) {
                        return "MifareClassic";
                    }
                    break;
                case 1939526272:
                    if (str.equals("android.nfc.tech.IsoDep")) {
                        return "ISO 14443-4";
                    }
                    break;
            }
        }
        return "unKnown";
    }

    public final boolean a(Context context) {
        NfcAdapter defaultAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        q.d(context, "context");
        Object systemService = context.getSystemService("nfc");
        if (!(systemService instanceof NfcManager)) {
            systemService = null;
        }
        NfcManager nfcManager = (NfcManager) systemService;
        return (nfcManager == null || (defaultAdapter = nfcManager.getDefaultAdapter()) == null || !defaultAdapter.isEnabled()) ? false : true;
    }

    public final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        q.d(context, "context");
        return context.getPackageManager().hasSystemFeature("android.hardware.nfc");
    }
}
