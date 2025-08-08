package com.ta.utdid2.device;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ta.audid.Variables;
import com.ta.audid.device.AppUtdidDecoder;
import com.ta.audid.device.UtdidObj;
import com.ta.audid.upload.UtdidKeyFile;
import com.ta.audid.upload.UtdidUploadTask;
import com.ta.audid.utils.AppInfoUtils;
import com.ta.audid.utils.MutiProcessLock;
import com.ta.audid.utils.TaskExecutor;
import com.ta.audid.utils.UtdidLogger;
import com.ta.utdid2.device.UTUtdid;
import tb.kge;

@Deprecated
/* loaded from: classes.dex */
public class AppUtdid {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AppUtdid";
    private static long mCollectDelayTime;
    private static final AppUtdid mInstance;
    private String mUtdid = "";

    static {
        kge.a(-463728369);
        mInstance = new AppUtdid();
        mCollectDelayTime = 30000L;
    }

    private AppUtdid() {
    }

    public static AppUtdid getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppUtdid) ipChange.ipc$dispatch("eaf2ec14", new Object[0]) : mInstance;
    }

    public synchronized String getUtdidCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74e25c21", new Object[]{this});
        } else if (StringUtils.isEmpty(this.mUtdid)) {
            return Constants.UTDID_INVALID;
        } else {
            return this.mUtdid;
        }
    }

    public synchronized String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{this, context});
        } else if (!StringUtils.isEmpty(this.mUtdid)) {
            return this.mUtdid;
        } else {
            MutiProcessLock.lockUtdidFile();
            String v5Utdid = getV5Utdid();
            if (StringUtils.isEmpty(v5Utdid)) {
                v5Utdid = UTUtdid.instance(context).getValue();
            }
            if (StringUtils.isEmpty(v5Utdid)) {
                MutiProcessLock.releaseUtdidFile();
                return Constants.UTDID_INVALID;
            }
            this.mUtdid = v5Utdid;
            uploadAppUtdid();
            String str = this.mUtdid;
            MutiProcessLock.releaseUtdidFile();
            return str;
        }
    }

    private String getV5Utdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf8401ce", new Object[]{this});
        }
        final Context context = Variables.getInstance().getContext();
        if (context == null) {
            return "";
        }
        final String readAppUtdidFile = UtdidKeyFile.readAppUtdidFile();
        if (UTUtdid.isValidUtdid(readAppUtdidFile)) {
            UtdidLogger.d(TAG, "read utdid from V5AppFile");
            UTUtdid.setType(7);
            UTUtdid.startSyncThread(new UTUtdid.a() { // from class: com.ta.utdid2.device.AppUtdid.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
                    if (r1.getTimestamp() >= r0.getTimestamp()) goto L12;
                 */
                @Override // com.ta.utdid2.device.UTUtdid.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void a() {
                    /*
                        r6 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = com.ta.utdid2.device.AppUtdid.AnonymousClass1.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        if (r1 == 0) goto L12
                        r1 = 1
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r2 = 0
                        r1[r2] = r6
                        java.lang.String r2 = "56c6c68"
                        r0.ipc$dispatch(r2, r1)
                        return
                    L12:
                        java.lang.String r0 = r2
                        com.ta.audid.device.UtdidObj r0 = com.ta.audid.device.AppUtdidDecoder.decode(r0)
                        android.content.Context r1 = r3
                        java.lang.String r1 = com.ta.audid.upload.UtdidKeyFile.getUtdidFromSettings(r1)
                        boolean r2 = android.text.StringUtils.isEmpty(r1)
                        if (r2 != 0) goto L3a
                        com.ta.audid.device.UtdidObj r1 = com.ta.audid.device.AppUtdidDecoder.decode(r1)
                        boolean r2 = r1.isValid()
                        if (r2 == 0) goto L3a
                        long r1 = r1.getTimestamp()
                        long r3 = r0.getTimestamp()
                        int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                        if (r5 >= 0) goto L41
                    L3a:
                        android.content.Context r1 = r3
                        java.lang.String r2 = r2
                        com.ta.audid.upload.UtdidKeyFile.writeUtdidToSettings(r1, r2)
                    L41:
                        java.lang.String r1 = com.ta.audid.upload.UtdidKeyFile.readSdcardUtdidFile()
                        boolean r2 = android.text.StringUtils.isEmpty(r1)
                        if (r2 != 0) goto L67
                        com.ta.audid.device.UtdidObj r1 = com.ta.audid.device.AppUtdidDecoder.decode(r1)
                        boolean r2 = r1.isValid()
                        if (r2 == 0) goto L61
                        long r1 = r1.getTimestamp()
                        long r3 = r0.getTimestamp()
                        int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                        if (r0 >= 0) goto L66
                    L61:
                        java.lang.String r0 = r2
                        com.ta.audid.upload.UtdidKeyFile.writeSdcardUtdidFile(r0)
                    L66:
                        return
                    L67:
                        java.lang.String r0 = r2
                        com.ta.audid.upload.UtdidKeyFile.writeSdcardUtdidFile(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.device.AppUtdid.AnonymousClass1.a():void");
                }
            });
            return readAppUtdidFile;
        }
        final String utdidFromSettings = UtdidKeyFile.getUtdidFromSettings(context);
        if (UTUtdid.isValidUtdid(utdidFromSettings)) {
            UtdidLogger.d(TAG, "read utdid from V5Settings");
            UTUtdid.setType(8);
            UTUtdid.startSyncThread(new UTUtdid.a() { // from class: com.ta.utdid2.device.AppUtdid.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    UtdidKeyFile.writeAppUtdidFile(utdidFromSettings);
                    String readSdcardUtdidFile = UtdidKeyFile.readSdcardUtdidFile();
                    if (StringUtils.isEmpty(readSdcardUtdidFile)) {
                        UtdidKeyFile.writeSdcardUtdidFile(utdidFromSettings);
                        return;
                    }
                    UtdidObj decode = AppUtdidDecoder.decode(utdidFromSettings);
                    UtdidObj decode2 = AppUtdidDecoder.decode(readSdcardUtdidFile);
                    if (decode2.isValid() && decode2.getTimestamp() >= decode.getTimestamp()) {
                        return;
                    }
                    UtdidKeyFile.writeSdcardUtdidFile(utdidFromSettings);
                }
            });
            return utdidFromSettings;
        }
        final String readSdcardUtdidFile = UtdidKeyFile.readSdcardUtdidFile();
        if (!UTUtdid.isValidUtdid(readSdcardUtdidFile)) {
            return null;
        }
        UtdidLogger.d(TAG, "read utdid from V5Sdcard");
        UTUtdid.setType(9);
        UTUtdid.startSyncThread(new UTUtdid.a() { // from class: com.ta.utdid2.device.AppUtdid.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ta.utdid2.device.UTUtdid.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                UtdidKeyFile.writeAppUtdidFile(readSdcardUtdidFile);
                UtdidKeyFile.writeUtdidToSettings(context, readSdcardUtdidFile);
            }
        });
        return readSdcardUtdidFile;
    }

    private void uploadAppUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a0a587", new Object[]{this});
            return;
        }
        UtdidLogger.d();
        if (StringUtils.isEmpty(this.mUtdid)) {
            return;
        }
        try {
            final Context context = Variables.getInstance().getContext();
            if (!AppInfoUtils.isMainProcess(context)) {
                return;
            }
            TaskExecutor.getInstance().schedule(null, new Runnable() { // from class: com.ta.utdid2.device.AppUtdid.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!UtdidKeyFile.enableUpload(context)) {
                        UtdidLogger.d("", "unable upload!");
                    } else {
                        new UtdidUploadTask(context).run();
                    }
                }
            }, mCollectDelayTime);
        } catch (Throwable th) {
            UtdidLogger.d("", th);
        }
    }

    public synchronized String getCurrentAppUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73e161f7", new Object[]{this});
        }
        return this.mUtdid;
    }

    public static void setCollectDelayTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510eb2b5", new Object[]{new Long(j)});
        } else if (j < 0) {
        } else {
            mCollectDelayTime = j;
        }
    }
}
