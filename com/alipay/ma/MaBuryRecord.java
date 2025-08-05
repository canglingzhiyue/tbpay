package com.alipay.ma;

import android.os.AsyncTask;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes3.dex */
public class MaBuryRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile EngineBuryRecord f5308a;

    /* loaded from: classes3.dex */
    public interface EngineBuryRecord {
        void recodeDecodeFailedMaInfo(String str);

        void recordBigPixelsImageScan(double d, double d2);

        void recordRecognizedPerformance(Object obj);

        void recordScanDecodeTrack(String str, String str2, Map map);

        void reportEightSecondsNotRecognize(long j, String str);

        void reportSoLoadResult(int i, String str, long j);

        void reportUnusualScanCase(int i, String str);
    }

    public static void registerEngineBuryRecord(EngineBuryRecord engineBuryRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45590e5c", new Object[]{engineBuryRecord});
        } else {
            f5308a = engineBuryRecord;
        }
    }

    public static void unRegisterEngineBuryRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ebd9730", new Object[0]);
        } else {
            f5308a = null;
        }
    }

    public static void recordScanDecodeTrack(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f86927b", new Object[]{str, str2, map});
        } else if (f5308a != null) {
            f5308a.recordScanDecodeTrack(str, str2, map);
        } else {
            a(str, str2, map);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.alipay.ma.MaBuryRecord$1] */
    private static void a(final String str, final String str2, final Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            new AsyncTask<Object, Object, Object>() { // from class: com.alipay.ma.MaBuryRecord.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.AsyncTask
                public Object doInBackground(Object... objArr) {
                    try {
                        Class<?> cls = Class.forName("com.alipay.mobile.mascanengine.BuryRecord");
                        cls.getDeclaredMethod("recordScanDecodeTrack", String.class, String.class, Map.class).invoke(cls.newInstance(), str, str2, map);
                        return null;
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        Log.e("MaBuryRecord", "asyncRecordImageDecodeTrack()", e);
                        return null;
                    }
                }
            }.execute(new Object[0]);
        }
    }

    public static void recordBigPixelsImageScan(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c713d4e3", new Object[]{new Double(d), new Double(d2)});
        } else if (f5308a == null) {
        } else {
            f5308a.recordBigPixelsImageScan(d, d2);
        }
    }

    public static void recodeDecodeFailedMaInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67f3d9e", new Object[]{str});
        } else if (f5308a == null) {
        } else {
            f5308a.recodeDecodeFailedMaInfo(str);
        }
    }

    public static void recordRecognizedPerformance(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8296e0cc", new Object[]{obj});
        } else if (f5308a == null) {
        } else {
            f5308a.recordRecognizedPerformance(obj);
        }
    }

    public static void reportUnusualScanCase(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0925444", new Object[]{new Integer(i), str});
        } else if (f5308a == null) {
        } else {
            f5308a.reportUnusualScanCase(i, str);
        }
    }

    public static void reportEightSecondsNotRecognize(Map map) {
        String str;
        boolean z;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d01e5f", new Object[]{map});
        } else if (map == null) {
            MaLogger.d("MaBuryRecord", "MaScanEngine decodeInfo == null");
        } else {
            Object obj = map.get("DecodeStep_find_selectedBestPatterns");
            if (obj == null || !(obj instanceof byte[])) {
                str = "sdk error";
                z = false;
                i = -2;
            } else {
                byte[] bArr = (byte[]) obj;
                if (bArr.length == 0) {
                    str = "selectedPattern is null";
                    z = false;
                    i = -1;
                } else if (bArr.length == 1 && bArr[0] == 48) {
                    str = "no selectedPatterns";
                    z = false;
                    i = 0;
                } else {
                    str = null;
                    z = true;
                    i = -3;
                }
            }
            if (z) {
                Object obj2 = map.get("DecodeStep_find_DetectorResult");
                if (obj2 == null || !(obj2 instanceof byte[])) {
                    str = "findDetectorResult error";
                    z = false;
                    i = 1;
                } else {
                    byte[] bArr2 = (byte[]) obj2;
                    if (bArr2.length == 0) {
                        str = "findDetectorResult is null";
                        z = false;
                        i = 2;
                    } else if (bArr2.length == 1 && bArr2[0] == 48) {
                        str = "not to findDetectorResult";
                        z = false;
                        i = 3;
                    } else {
                        z = true;
                    }
                }
            }
            if (z) {
                Object obj3 = map.get("DecodeStep_decode_solomonReadFailed");
                if (obj3 == null || !(obj3 instanceof byte[])) {
                    i = 4;
                    str = "solomonRead error";
                } else {
                    byte[] bArr3 = (byte[]) obj3;
                    if (bArr3.length == 0) {
                        i = 5;
                        str = "solomonRead is null";
                    } else if (bArr3.length == 1 && bArr3[0] == 48) {
                        i = 6;
                        str = "not to solomonRead";
                    }
                }
            }
            if (f5308a != null && i > -3) {
                f5308a.reportEightSecondsNotRecognize(i, str);
            }
            if (!MaLogger.isDebuggable()) {
                return;
            }
            MaLogger.d("MaBuryRecord", "MaScanEngine resultCode: " + i + " resultMsg: " + str);
        }
    }

    public static void reportSoLoadResult(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85871fd1", new Object[]{new Integer(i), str, new Long(j)});
        } else if (f5308a != null) {
            f5308a.reportSoLoadResult(i, str, j);
        } else {
            a(i, j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.alipay.ma.MaBuryRecord$2] */
    private static void a(final int i, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{new Integer(i), new Long(j)});
        } else {
            new AsyncTask<Object, Object, Object>() { // from class: com.alipay.ma.MaBuryRecord.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.AsyncTask
                public Object doInBackground(Object... objArr) {
                    try {
                        Class<?> cls = Class.forName("com.alipay.mobile.mascanengine.BuryRecord");
                        cls.getDeclaredMethod("reportSoLoadResult", Integer.TYPE, Long.TYPE).invoke(cls.newInstance(), Integer.valueOf(i), Long.valueOf(j));
                        return null;
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        Log.e("MaBuryRecord", "asyncBurySoLoad()", e);
                        return null;
                    }
                }
            }.execute(new Object[0]);
        }
    }
}
