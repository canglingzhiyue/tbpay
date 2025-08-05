package tb;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import anetwork.channel.download.DownloadManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.ut.share.business.ShareBusiness;
import tb.obl;

/* loaded from: classes8.dex */
public class obf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SHARE_BACKFLOW = "saveBackFlowWeexFinish";
    public static final String KEY_SHARE_BACKFLOW_JS = "shareBackFlowFile.js";
    public static final String KEY_SHARE_BACKFLOW_WEEX2 = "saveBackFlowWeex2Finish";
    public static final String KEY_SHARE_BACKFLOW_WEEX2_JS = "shareBackFlowFileWeex2.js";
    public static final String KEY_SHARE_PANEL = "saveWeexFinish";
    public static final String KEY_SHARE_PANEL_JS = "shareFile.js";
    public static final String KEY_SHARE_PANEL_WEEX2 = "saveWeex2Finish";
    public static final String KEY_SHARE_PANEL_WEEX2_JS = "shareFileWeex2.js";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31883a;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, String str);

        void onSuccess(int i, String str);
    }

    public static /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b(z);
        }
    }

    static {
        kge.a(-551910689);
        f31883a = false;
    }

    private static boolean a(final Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : obl.a(new obl.a() { // from class: tb.obf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.obl.a
            public boolean a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : ContextCompat.checkSelfPermission(context, str) == 0;
            }
        });
    }

    public static void a(Context context, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a55c56", new Object[]{context, str, str2, str3, new Boolean(z)});
            return;
        }
        try {
            if (obh.t()) {
                b(context, str, str2, str3, z);
            } else if (a(context)) {
                b(context, str, str2, str3, z);
            } else {
                b(z);
            }
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287e3758", new Object[]{context, str, str2, str3, new Boolean(z)});
            return;
        }
        try {
            String str4 = "verifyStoragePermissionsAndDownloadAsync 1 isDownLoading=" + f31883a;
            if (f31883a) {
                return;
            }
            f31883a = true;
            String str5 = "verifyStoragePermissionsAndDownloadAsync 2 isDownLoading=" + f31883a;
            if (obh.t()) {
                b(context, str, str2, str3, z, new a() { // from class: tb.obf.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.obf.a
                    public void onSuccess(int i, String str6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str6});
                            return;
                        }
                        obf.f31883a = false;
                        String str7 = "verifyStoragePermissionsAndDownloadAsync 3 onSuccess isDownLoading=" + obf.f31883a;
                    }

                    @Override // tb.obf.a
                    public void a(int i, String str6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str6});
                            return;
                        }
                        obf.f31883a = false;
                        String str7 = "verifyStoragePermissionsAndDownloadAsync 3 onFail isDownLoading=" + obf.f31883a;
                    }
                });
            }
            if (a(context)) {
                b(context, str, str2, str3, z, new a() { // from class: tb.obf.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.obf.a
                    public void onSuccess(int i, String str6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str6});
                            return;
                        }
                        obf.f31883a = false;
                        String str7 = "verifyStoragePermissionsAndDownloadAsync 3-1 onSuccess isDownLoading=" + obf.f31883a;
                    }

                    @Override // tb.obf.a
                    public void a(int i, String str6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str6});
                            return;
                        }
                        obf.f31883a = false;
                        String str7 = "verifyStoragePermissionsAndDownloadAsync 3-1 onFail isDownLoading=" + obf.f31883a;
                    }
                });
                return;
            }
            b(z);
            f31883a = false;
            String str6 = "verifyStoragePermissionsAndDownloadAsync 4-1  isDownLoading=" + f31883a;
        } catch (Throwable unused) {
            String str7 = "verifyStoragePermissionsAndDownloadAsync 4-2  isDownLoading=" + f31883a;
            f31883a = false;
        }
    }

    private static void b(final Context context, String str, String str2, final String str3, final boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837ca297", new Object[]{context, str, str2, str3, new Boolean(z), aVar});
            return;
        }
        if (TextUtils.isEmpty(str) || aVar == null) {
            aVar.a(-1, "");
        }
        if (!str.contains("wh_ttid=native")) {
            str = str + "&wh_ttid=native";
        }
        obc.a(context, str3, "false");
        DownloadManager.getInstance().enqueue(str, ShareBizAdapter.getInstance().getAppEnv().b().getApplicationContext().getFilesDir().getAbsolutePath(), str2, new DownloadManager.DownloadListener() { // from class: tb.obf.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anetwork.channel.download.DownloadManager.DownloadListener
            public void onSuccess(int i, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str4});
                    return;
                }
                r0 = "downloadFileCallBack finish " + Thread.currentThread().getName() + " res: " + str4;
                obc.a(context, str3, "true");
                if (z) {
                    ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_LOAD_END_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
                    com.taobao.share.ui.engine.jsbridge.a.a().b();
                    nyy.c("TIMECOST", "weex_load_end: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
                }
                aVar.onSuccess(i, str4);
            }

            @Override // anetwork.channel.download.DownloadManager.DownloadListener
            public void onFail(int i, int i2, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str4});
                    return;
                }
                String str5 = "downloadFileCallBack onFail " + Thread.currentThread().getName() + " res: " + str4;
                obf.a(z);
                aVar.a(i, str4);
            }

            @Override // anetwork.channel.download.DownloadManager.DownloadListener
            public void onProgress(int i, long j, long j2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
                    return;
                }
                String str4 = "downloadFileCallBack onProgress " + Thread.currentThread().getName();
            }
        });
    }

    private static void b(final Context context, String str, String str2, final String str3, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7091c9d7", new Object[]{context, str, str2, str3, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (!str.contains("wh_ttid=native")) {
                str = str + "&wh_ttid=native";
            }
            obc.a(context, str3, "false");
            DownloadManager.getInstance().enqueue(str, ShareBizAdapter.getInstance().getAppEnv().b().getApplicationContext().getFilesDir().getAbsolutePath(), str2, new DownloadManager.DownloadListener() { // from class: tb.obf.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anetwork.channel.download.DownloadManager.DownloadListener
                public void onSuccess(int i, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str4});
                        return;
                    }
                    String str5 = "download finish " + Thread.currentThread().getName() + " res: " + str4;
                    obc.a(context, str3, "true");
                    if (!z) {
                        return;
                    }
                    ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_LOAD_END_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
                    com.taobao.share.ui.engine.jsbridge.a.a().b();
                    nyy.c("TIMECOST", "weex_load_end: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
                }

                @Override // anetwork.channel.download.DownloadManager.DownloadListener
                public void onFail(int i, int i2, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str4});
                        return;
                    }
                    String str5 = "download onFail " + Thread.currentThread().getName() + " res: " + str4;
                    obf.a(z);
                }

                @Override // anetwork.channel.download.DownloadManager.DownloadListener
                public void onProgress(int i, long j, long j2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
                        return;
                    }
                    String str4 = "download onProgress " + Thread.currentThread().getName();
                }
            });
        }
    }

    private static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else if (!z) {
        } else {
            ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_LOAD_END_KEY, (Object) (-1L));
            com.taobao.share.ui.engine.jsbridge.a.a().b();
            nyy.c("TIMECOST", "weex_load_end: -1");
        }
    }
}
