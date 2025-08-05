package com.taobao.share.picturepassword;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.picturepassword.c;
import com.taobao.share.visualcode.MtopGetShortUrlByGen3Request;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.android.agoo.common.AgooConstants;
import tb.kge;
import tb.nyg;
import tb.nyy;
import tb.obl;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f19638a;
    private static String b;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(String str);
    }

    public static /* synthetic */ AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("49f1dfa8", new Object[0]) : f19638a;
    }

    public static /* synthetic */ void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b79cda", new Object[]{str, aVar});
        } else {
            b(str, aVar);
        }
    }

    public static /* synthetic */ boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : c(str);
    }

    public static /* synthetic */ boolean a(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6e7fbda", new Object[]{str, context})).booleanValue() : b(str, context);
    }

    public static /* synthetic */ String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        b = str;
        return str;
    }

    public static /* synthetic */ void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            c(context);
        }
    }

    static {
        kge.a(-324677119);
        f19638a = new AtomicBoolean(false);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.taobao.share.picturepassword.c$1] */
    public static void a(final Context context, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66492288", new Object[]{context, aVar});
        } else if (!nyg.i()) {
            TLog.loge("TBShare#ShareCopyAlbumChecker", "share_can_read_photo_album false");
        } else if (!d(context)) {
            TLog.loge("TBShare#ShareCopyAlbumChecker", "return: 没有外部访问权限");
            aVar.a();
        } else if (f19638a.get()) {
            TLog.loge("TBShare#ShareCopyAlbumChecker", "return: 正忙");
            aVar.a();
        } else {
            f19638a.set(true);
            new AsyncTask<Void, Void, Void>() { // from class: com.taobao.share.picturepassword.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -1325021319) {
                        super.onPostExecute(objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(Void r4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, r4});
                    } else {
                        a(r4);
                    }
                }

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
                    	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
                    	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
                    */
                public java.lang.Void a(java.lang.Void... r20) {
                    /*
                        Method dump skipped, instructions count: 959
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.share.picturepassword.c.AnonymousClass1.a(java.lang.Void[]):java.lang.Void");
                }

                public void a(Void r4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6f8d528f", new Object[]{this, r4});
                        return;
                    }
                    super.onPostExecute(r4);
                    c.a().set(false);
                }
            }.execute(new Void[0]);
        }
    }

    private static void c(Context context) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sp_share_backflow_config", 0);
        if (sharedPreferences.getBoolean("hasClearOldTempFile", false) || !"true".equals(OrangeConfig.getInstance().getConfig("android_share", "deleteOldTempFile", "false"))) {
            return;
        }
        try {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.isDirectory() && (listFiles = cacheDir.listFiles()) != null) {
                for (File file : listFiles) {
                    String name = file.getName();
                    if (!TextUtils.isEmpty(name) && name.split("\\.").length > 0) {
                        String str = name.split("\\.")[0];
                        if (str.length() == 13) {
                            try {
                                if (Long.parseLong(str) > 0) {
                                    b.a(file);
                                    nyy.a("TBShare#ShareCopyAlbumChecker", "delete: " + file.getName());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("hasClearOldTempFile", true);
                edit.apply();
            }
        }
    }

    private static boolean d(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        try {
            return obl.a(new obl.a() { // from class: com.taobao.share.picturepassword.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.obl.a
                public boolean a(String str) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
                }
            });
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void b(String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22d3d5b", new Object[]{str, aVar});
            return;
        }
        MtopGetShortUrlByGen3Request mtopGetShortUrlByGen3Request = new MtopGetShortUrlByGen3Request();
        mtopGetShortUrlByGen3Request.setGen3code(str);
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopGetShortUrlByGen3Request);
        TLog.loge("TBShare#ShareCopyAlbumChecker", "log: 解码成功,获取视觉码对应的短链");
        build.registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.share.picturepassword.ShareCopyAlbumChecker$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TLog.loge("TBShare#ShareCopyAlbumChecker", "err: get short url system error");
                c.a.this.a();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                String optString = mtopResponse.getDataJsonObject().optString("shortUrl");
                if (TextUtils.isEmpty(optString)) {
                    TLog.loge("TBShare#ShareCopyAlbumChecker", "err: get short url success --> 1");
                    c.a.this.a();
                    return;
                }
                TLog.loge("TBShare#ShareCopyAlbumChecker", "log: get short url success --> 2  --> " + optString);
                c.a.this.a(optString);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TLog.loge("TBShare#ShareCopyAlbumChecker", "get short url error");
                c.a.this.a();
            }
        });
        build.startRequest();
    }

    private static boolean b(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0b29db9", new Object[]{str, context})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String b2 = com.taobao.share.picturepassword.a.a(context).b("latest_pic_add_date", null);
        if (TextUtils.isEmpty(b2)) {
            return true;
        }
        try {
            return Long.parseLong(str) > Long.parseLong(b2);
        } catch (Throwable unused) {
            TLog.loge("TBShare#ShareCopyAlbumChecker", "date数据转换失败");
            return false;
        }
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return (System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(str)).longValue() < Long.valueOf((Long.parseLong(nyg.a("checkPicOutTime", AgooConstants.REPORT_NOT_ENCRYPT)) * 60) * 60).longValue();
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if (!TextUtils.isEmpty(b)) {
            com.taobao.share.picturepassword.a.a(context).a("latest_pic_add_date", b);
        }
        b = null;
    }
}
