package com.ta.utdid2.device;

import android.content.Context;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Variables;
import com.ta.audid.utils.FileUtils;
import com.ta.audid.utils.MutiProcessLock;
import com.ta.audid.utils.RC4;
import com.ta.audid.utils.UtdidLogger;
import com.ta.utdid2.android.utils.Base64;
import com.ta.utdid2.android.utils.IntUtils;
import com.ta.utdid2.android.utils.PhoneInfoUtils;
import com.ta.utdid2.android.utils.StringUtils;
import com.ta.utdid2.core.persistent.PersistentConfiguration;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tb.kge;
import tb.tof;

@Deprecated
/* loaded from: classes.dex */
public class UTUtdid {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Object CREATE_LOCK;
    private static final String S_GLOBAL_DIR = ".UTSystemConfig";
    private static final String S_GLOBAL_PERSISTENT_CONFIG_DIR;
    private static final String S_GLOBAL_PERSISTENT_CONFIG_KEY = "Alvin2";
    private static final String S_UTDID_DIR;
    private static final String TAG = "UTUtdid";
    private static final int TYPE_CREATE = 6;
    private static final int TYPE_DEFAULT = 0;
    private static final int TYPE_DIR = 4;
    private static final int TYPE_ECDID = 5;
    private static final int TYPE_MYSP = 3;
    private static final int TYPE_OLD = 1;
    public static final int TYPE_SERVER_APP = 7;
    public static final int TYPE_SERVER_SDCARD = 9;
    public static final int TYPE_SERVER_SETTINGS = 8;
    private static final int TYPE_SETTINGS = 2;
    private static final String UM_SETTINGS_STORAGE_NEW = "mqBRboGZkQPcAkyk";
    private static final String UM_SETTINGS_STORAGE_OLD = "dxCRMxhQkdGePGnp";
    private static final int U_SIZE = 18;
    private static String mExtendFactor;
    private static UTUtdid mInstance;
    private static Pattern mPattern;
    private static int mType;
    private Context mContext;
    private PersistentConfiguration mPersistentConfiguration;
    private String mUtdid = null;
    private boolean mInvalidUtdidDir = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ void access$000(UTUtdid uTUtdid, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56af477f", new Object[]{uTUtdid, str});
        } else {
            uTUtdid.saveUtdidToNewSettings(str);
        }
    }

    public static /* synthetic */ PersistentConfiguration access$100(UTUtdid uTUtdid) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PersistentConfiguration) ipChange.ipc$dispatch("fe854c79", new Object[]{uTUtdid}) : uTUtdid.mPersistentConfiguration;
    }

    public static /* synthetic */ void access$200(UTUtdid uTUtdid, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a957f201", new Object[]{uTUtdid, str});
        } else {
            uTUtdid.writeUtdidDir(str);
        }
    }

    public static /* synthetic */ String access$300(UTUtdid uTUtdid) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9bd4828", new Object[]{uTUtdid}) : uTUtdid.readUtdidDir();
    }

    static {
        kge.a(-408944879);
        mInstance = null;
        mPattern = Pattern.compile("[^0-9a-zA-Z=/+]+");
        CREATE_LOCK = new Object();
        S_GLOBAL_PERSISTENT_CONFIG_DIR = S_GLOBAL_DIR + File.separator + "Global";
        S_UTDID_DIR = ".7934039a" + File.separator + ".u";
        mType = 0;
        mExtendFactor = "";
    }

    public static void setExtendFactor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c2e6dc", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            mExtendFactor = str;
        }
    }

    private UTUtdid(Context context) {
        this.mContext = null;
        this.mPersistentConfiguration = null;
        this.mContext = context;
        Variables.getInstance().initContext(context);
        this.mPersistentConfiguration = new PersistentConfiguration(context, S_GLOBAL_PERSISTENT_CONFIG_DIR, S_GLOBAL_PERSISTENT_CONFIG_KEY);
    }

    public static UTUtdid instance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTUtdid) ipChange.ipc$dispatch("4551d1e8", new Object[]{context});
        }
        if (context != null && mInstance == null) {
            synchronized (CREATE_LOCK) {
                if (mInstance == null) {
                    mInstance = new UTUtdid(context);
                }
            }
        }
        return mInstance;
    }

    public static int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[0])).intValue() : mType;
    }

    public static void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{new Integer(i)});
        } else {
            mType = i;
        }
    }

    public synchronized String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        } else if (this.mUtdid != null) {
            return this.mUtdid;
        } else {
            return getValueForUpdate();
        }
    }

    private String getValueForUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95c5ede2", new Object[]{this});
        }
        String readUtdid = readUtdid();
        if (isValidUtdid(readUtdid)) {
            if (!TextUtils.isEmpty(readUtdid) && readUtdid.endsWith("\n")) {
                this.mUtdid = readUtdid.substring(0, readUtdid.length() - 1);
            } else {
                this.mUtdid = readUtdid;
            }
            return this.mUtdid;
        }
        try {
            byte[] generateUtdid = generateUtdid();
            if (generateUtdid == null) {
                return null;
            }
            this.mUtdid = Base64.encodeToString(generateUtdid, 2);
            mType = 6;
            writeNewUtdidAsync(this.mUtdid);
            return this.mUtdid;
        } catch (Exception e) {
            UtdidLogger.e("", e, new Object[0]);
            return null;
        }
    }

    private void writeNewUtdidAsync(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a310bce", new Object[]{this, str});
        } else if (!isValidUtdid(str)) {
        } else {
            mType = 6;
            UtdidLogger.d(TAG, "utdid type:", Integer.valueOf(mType));
            this.mPersistentConfiguration.writeUtdidToSp(str, mType);
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    UTUtdid.access$000(UTUtdid.this, str);
                    UTUtdid.access$100(UTUtdid.this).copySPToMySP();
                    UTUtdid.access$200(UTUtdid.this, str);
                    b.a(str);
                }
            });
        }
    }

    private void writeSpFromSettingsAsync(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625bdfa4", new Object[]{this, str});
        } else if (!isValidUtdid(str)) {
        } else {
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (str.equals(UTUtdid.access$100(UTUtdid.this).getUtdidFromSp())) {
                    } else {
                        UTUtdid.access$100(UTUtdid.this).updateUtdidToSp(str);
                    }
                }
            });
        }
    }

    private String readUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cf27af", new Object[]{this});
        }
        String utdidFromNewSettings = getUtdidFromNewSettings();
        if (isValidUtdid(utdidFromNewSettings)) {
            mType = 2;
            UtdidLogger.d(TAG, "utdid type", Integer.valueOf(mType));
            writeSpFromSettingsAsync(utdidFromNewSettings);
            return utdidFromNewSettings;
        }
        String utdidFromOldSettings = getUtdidFromOldSettings();
        if (isValidUtdid(utdidFromOldSettings)) {
            mType = 2;
            UtdidLogger.d(TAG, "utdid type", Integer.valueOf(mType));
            writeSpFromSettingsAsync(utdidFromOldSettings);
            return utdidFromOldSettings;
        }
        final String utdidFromSp = this.mPersistentConfiguration.getUtdidFromSp();
        if (isValidUtdid(utdidFromSp)) {
            int typeFromSp = this.mPersistentConfiguration.getTypeFromSp();
            if (typeFromSp == 0) {
                mType = 1;
            } else {
                mType = typeFromSp;
            }
            UtdidLogger.d(TAG, "get utdid from sp. type", Integer.valueOf(mType));
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    UTUtdid.access$000(UTUtdid.this, utdidFromSp);
                    String utdidFromMySp = UTUtdid.access$100(UTUtdid.this).getUtdidFromMySp();
                    if (!UTUtdid.isValidUtdid(utdidFromMySp) && UTUtdid.access$100(UTUtdid.this).copySPToMySP()) {
                        utdidFromMySp = utdidFromSp;
                    }
                    String access$300 = UTUtdid.access$300(UTUtdid.this);
                    if (UTUtdid.isValidUtdid(utdidFromMySp) && !utdidFromMySp.equals(access$300)) {
                        UTUtdid.access$200(UTUtdid.this, utdidFromMySp);
                    }
                    if (UTUtdid.isValidUtdid(b.a())) {
                        b.c();
                    } else {
                        b.a(utdidFromSp);
                    }
                }
            });
            return utdidFromSp;
        }
        final String utdidFromMySp = this.mPersistentConfiguration.getUtdidFromMySp();
        if (isValidUtdid(utdidFromMySp)) {
            mType = 3;
            UtdidLogger.d(TAG, "utdid type", Integer.valueOf(mType));
            this.mPersistentConfiguration.copyMySPToSP(mType);
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    UTUtdid.access$000(UTUtdid.this, utdidFromMySp);
                    String access$300 = UTUtdid.access$300(UTUtdid.this);
                    if (UTUtdid.isValidUtdid(utdidFromMySp) && !utdidFromMySp.equals(access$300)) {
                        UTUtdid.access$200(UTUtdid.this, utdidFromMySp);
                    }
                    if (UTUtdid.isValidUtdid(b.a())) {
                        b.c();
                    } else {
                        b.a(utdidFromMySp);
                    }
                }
            });
            return utdidFromMySp;
        }
        final String readUtdidDir = readUtdidDir();
        if (isValidUtdid(readUtdidDir)) {
            mType = 4;
            UtdidLogger.d(TAG, "utdid type", Integer.valueOf(mType));
            this.mPersistentConfiguration.writeUtdidToSp(readUtdidDir, mType);
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    UTUtdid.access$000(UTUtdid.this, readUtdidDir);
                    UTUtdid.access$100(UTUtdid.this).copySPToMySP();
                    if (UTUtdid.isValidUtdid(b.a())) {
                        b.c();
                    } else {
                        b.a(readUtdidDir);
                    }
                }
            });
            return readUtdidDir;
        }
        final String a2 = b.a();
        if (!isValidUtdid(a2)) {
            UtdidLogger.d(TAG, "read utdid is null");
            return null;
        }
        mType = 5;
        UtdidLogger.d(TAG, "utdid type", Integer.valueOf(mType));
        this.mPersistentConfiguration.writeUtdidToSp(a2, mType);
        startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ta.utdid2.device.UTUtdid.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                UTUtdid.access$000(UTUtdid.this, a2);
                UTUtdid.access$100(UTUtdid.this).copySPToMySP();
                UTUtdid.access$200(UTUtdid.this, a2);
                b.c();
            }
        });
        return a2;
    }

    private void saveUtdidToNewSettings(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957db3f6", new Object[]{this, str});
        } else if (PhoneInfoUtils.isPrivacyMode() || !isValidUtdid(str)) {
        } else {
            try {
                Settings.System.putString(this.mContext.getContentResolver(), UM_SETTINGS_STORAGE_NEW, str);
            } catch (Exception unused) {
            }
        }
    }

    private String getUtdidFromNewSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1fc0faa", new Object[]{this});
        }
        if (PhoneInfoUtils.isPrivacyMode()) {
            return "";
        }
        try {
            return Settings.System.getString(this.mContext.getContentResolver(), UM_SETTINGS_STORAGE_NEW);
        } catch (Exception unused) {
            return "";
        }
    }

    private String getUtdidFromOldSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffb90c83", new Object[]{this});
        }
        if (PhoneInfoUtils.isPrivacyMode()) {
            return "";
        }
        String str = null;
        try {
            str = Settings.System.getString(this.mContext.getContentResolver(), UM_SETTINGS_STORAGE_OLD);
        } catch (Exception unused) {
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                d dVar = new d();
                String b = dVar.b(str);
                if (isValidUtdid(b)) {
                    UtdidLogger.d(TAG, "OldSettings_1", b);
                    saveUtdidToNewSettings(b);
                    return b;
                }
                String a2 = dVar.a(str);
                if (isValidUtdid(a2)) {
                    UtdidLogger.d(TAG, "OldSettings_2", a2);
                    saveUtdidToNewSettings(a2);
                    return a2;
                }
                String a3 = new c().a(str);
                if (isValidUtdid(a3)) {
                    UtdidLogger.d(TAG, "OldSettings_3", a3);
                    saveUtdidToNewSettings(a3);
                    return a3;
                }
            }
        } catch (Throwable th) {
            UtdidLogger.se(TAG, th, new Object[0]);
        }
        return "";
    }

    private void writeUtdidDir(String str) {
        byte[] decode;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d3cd7d", new Object[]{this, str});
        } else if (!PhoneInfoUtils.isSdcardPrivacyMode()) {
            UtdidLogger.d(TAG, "writeUtdidDir", str);
            long currentTimeMillis = System.currentTimeMillis();
            if (!isValidUtdid(str) || (decode = Base64.decode(str, 2)) == null || decode.length != 18) {
                return;
            }
            String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + S_UTDID_DIR;
            try {
                UtdidLogger.se(TAG, "delete baseDir", str2);
                FileUtils.delete(str2);
                UtdidLogger.se(TAG, "delete baseDir success");
                try {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < 18; i++) {
                        sb.delete(0, sb.length());
                        sb.append(str2);
                        sb.append(File.separator);
                        sb.append(RVStartParams.KEY_URL_SHORT);
                        sb.append(i);
                        byte b = decode[i];
                        for (int i2 = 0; i2 < 8; i2++) {
                            sb.append(File.separator);
                            sb.append((int) ((byte) (((byte) (b >> (7 - i2))) & 1)));
                        }
                        String sb2 = sb.toString();
                        UtdidLogger.sd(TAG, "mk dir", sb2);
                        if (!mkUtdidDir(sb2)) {
                            UtdidLogger.d(TAG, "writeUtdidDir success", false);
                            return;
                        }
                        String valueOf = String.valueOf((int) b);
                        UtdidLogger.sd(TAG, "writeUtdidDir content", valueOf);
                        FileUtils.saveFile(sb2 + "/success", valueOf);
                    }
                    z = true;
                } catch (Exception e) {
                    UtdidLogger.se(TAG, e, new Object[0]);
                    z = false;
                }
                UtdidLogger.d(TAG, "writeUtdidDir success", Boolean.valueOf(z), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                UtdidLogger.se(TAG, "delete baseDir fail");
                UtdidLogger.se(TAG, th, new Object[0]);
            }
        }
    }

    private static boolean mkUtdidDir(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52942b00", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            UtdidLogger.sd(TAG, "path is exits", str);
            return true;
        }
        boolean mkdirs = file.mkdirs();
        UtdidLogger.sd(TAG, "mkUtdidDir path", str, "mkdirs success", Boolean.valueOf(mkdirs));
        return mkdirs;
    }

    private String readUtdidDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9145dc36", new Object[]{this});
        }
        if (PhoneInfoUtils.isSdcardPrivacyMode()) {
            return "";
        }
        UtdidLogger.d(TAG, "readUtdidDir");
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[18];
        String str = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + S_UTDID_DIR + File.separator + RVStartParams.KEY_URL_SHORT;
        for (int i = 0; i < 18; i++) {
            String str2 = str + i;
            UtdidLogger.sd(TAG, "uDir", str2);
            if (!FileUtils.checkFileExistOnly(str2)) {
                UtdidLogger.sd(TAG, "checkFileExistOnly", false);
                return null;
            }
            bArr[i] = readUtdidSubDir(str2);
            UtdidLogger.sd(TAG, "readUtdidDir", Byte.valueOf(bArr[i]), "mInvalidUtdidDir", Boolean.valueOf(this.mInvalidUtdidDir));
            if (this.mInvalidUtdidDir) {
                return null;
            }
        }
        String encodeToString = Base64.encodeToString(bArr, 2);
        UtdidLogger.d(TAG, "readUtdidDir", encodeToString, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return encodeToString;
    }

    private byte readUtdidSubDir(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df185394", new Object[]{this, str})).byteValue();
        }
        StringBuilder sb = new StringBuilder(str);
        byte b = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            sb.append(File.separator);
            sb.append("1");
            if (FileUtils.checkFileExistOnly(sb.toString())) {
                i = (b << 1) | 1;
            } else {
                int length = sb.length();
                sb.replace(length - 1, length, "0");
                i = b << 1;
            }
            b = (byte) i;
        }
        String sb2 = sb.toString();
        UtdidLogger.sd(TAG, "readUtdidDir", sb2);
        if (FileUtils.checkFileExistOnly(sb2)) {
            UtdidLogger.sd(TAG, "readUtdidDir b", Byte.valueOf(b));
            return b;
        }
        UtdidLogger.sd(TAG, "readUtdidDir false");
        this.mInvalidUtdidDir = true;
        return (byte) 0;
    }

    public static boolean isValidUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bf3bc3", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        return 24 == str.length() && !mPattern.matcher(str).find();
    }

    private byte[] generateUtdid() throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b81fe30b", new Object[]{this});
        }
        UtdidLogger.d(TAG, "generateUtdid");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] bytes = IntUtils.getBytes(currentTimeMillis);
        byte[] bytes2 = IntUtils.getBytes(nextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = mExtendFactor + PhoneInfoUtils.getImei(this.mContext);
        } catch (Exception unused) {
            str = mExtendFactor + new Random().nextInt();
        }
        byteArrayOutputStream.write(IntUtils.getBytes(StringUtils.hashCode(str)), 0, 4);
        byteArrayOutputStream.write(IntUtils.getBytes(StringUtils.hashCode(calcHmac(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    private static String calcHmac(byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27a60f76", new Object[]{bArr});
        }
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, tof.LF_LINK, -30, 9, -39, 33, -80, -68, -78, -117, tof.LF_DIR, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(RC4.rc4(bArr2), mac.getAlgorithm()));
        return Base64.encodeToString(mac.doFinal(bArr), 2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ta.utdid2.device.UTUtdid$7] */
    public static void startSyncThread(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daec67ef", new Object[]{aVar});
        } else {
            new Thread("UtdidSyncThread") { // from class: com.ta.utdid2.device.UTUtdid.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        UtdidLogger.d("startSyncThread", new Object[0]);
                        if (!MutiProcessLock.trylockSyncUtdid()) {
                            MutiProcessLock.releaseSyncUtdid();
                            return;
                        }
                        aVar.a();
                        MutiProcessLock.releaseSyncUtdid();
                    } catch (Throwable unused) {
                        MutiProcessLock.releaseSyncUtdid();
                    }
                }
            }.start();
        }
    }
}
