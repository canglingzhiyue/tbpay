package com.taobao.tao.handler.worker;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.qrcode.c;
import com.taobao.tao.util.AnalyticsUtil;
import com.taobao.tao.util.BitmapUtil;
import com.taobao.taobao.R;
import com.ut.share.utils.ShareUtils;
import java.io.File;
import tb.kge;
import tb.oba;
import tb.obc;
import tb.obl;
import tb.oif;
import tb.oir;

/* loaded from: classes8.dex */
public class e extends oir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a(Context context);

        void a(String str);

        void b(Context context);
    }

    static {
        kge.a(1074153968);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(e eVar, boolean z, Context context, TBShareContent tBShareContent, Bitmap bitmap, a aVar, String str, Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f632254e", new Object[]{eVar, new Boolean(z), context, tBShareContent, bitmap, aVar, str, bitmap2});
        } else {
            eVar.b(z, context, tBShareContent, bitmap, aVar, str, bitmap2);
        }
    }

    public static /* synthetic */ void b(e eVar, boolean z, Context context, TBShareContent tBShareContent, Bitmap bitmap, a aVar, String str, Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2c93ad", new Object[]{eVar, new Boolean(z), context, tBShareContent, bitmap, aVar, str, bitmap2});
        } else {
            eVar.a(z, context, tBShareContent, bitmap, aVar, str, bitmap2);
        }
    }

    public e(oif oifVar) {
        super(oifVar);
    }

    public void a(String str, final boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a27e269", new Object[]{this, str, new Boolean(z), aVar});
            return;
        }
        final Application b = ShareBizAdapter.getInstance().getAppEnv().b();
        final TBShareContent j = com.taobao.share.globalmodel.e.b().j();
        this.f32104a.a(AnalyticsUtil.getPlatformByTag(str), null, false, new c.a() { // from class: com.taobao.tao.handler.worker.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.share.qrcode.c.a
            public void a(int i, final Bitmap bitmap, boolean z2, final String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7dc551cb", new Object[]{this, new Integer(i), bitmap, new Boolean(z2), str2});
                } else if (aVar == null) {
                } else {
                    String str3 = "generateCallBack:" + Thread.currentThread().getName();
                    if (bitmap != null) {
                        com.taobao.phenix.intf.b.h().a(OrangeConfig.getInstance().getConfig("android_share", "bottomImageToScreenshot", "https://gw.alicdn.com/tfs/TB1yXjPdhD1gK0jSZFsXXbldVXa-1038-222.png")).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.handler.worker.e.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.phenix.intf.event.a
                            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                            }

                            public boolean a(SuccPhenixEvent succPhenixEvent) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Boolean) ipChange3.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                                }
                                if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                                    if (obl.b()) {
                                        e.a(e.this, z, b, j, bitmap, aVar, str2, drawable.getBitmap());
                                    } else {
                                        e.b(e.this, z, b, j, bitmap, aVar, str2, drawable.getBitmap());
                                    }
                                }
                                return false;
                            }
                        }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.handler.worker.e.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.phenix.intf.event.a
                            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                            }

                            public boolean a(FailPhenixEvent failPhenixEvent) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Boolean) ipChange3.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                                }
                                if (obl.b()) {
                                    e.a(e.this, z, b, j, bitmap, aVar, str2, null);
                                } else {
                                    e.b(e.this, z, b, j, bitmap, aVar, str2, null);
                                }
                                return false;
                            }
                        }).fetch();
                        return;
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(b);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.tao.handler.worker.e$2] */
    private void b(final boolean z, final Context context, final TBShareContent tBShareContent, final Bitmap bitmap, final a aVar, final String str, final Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74569c77", new Object[]{this, new Boolean(z), context, tBShareContent, bitmap, aVar, str, bitmap2});
        } else {
            new AsyncTask<Void, Void, String>() { // from class: com.taobao.tao.handler.worker.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str2, Object... objArr) {
                    if (str2.hashCode() == -1325021319) {
                        super.onPostExecute(objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
                @Override // android.os.AsyncTask
                public /* synthetic */ String doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, str2});
                    } else {
                        a(str2);
                    }
                }

                public String a(Void... voidArr) {
                    Bitmap bitmap3;
                    File cacheDir;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("45c9f3cc", new Object[]{this, voidArr});
                    }
                    String str2 = "doInBackground：" + Thread.currentThread().getName();
                    Bitmap imageFromPath = ShareUtils.imageFromPath(tBShareContent.screenshot);
                    if (imageFromPath == null || bitmap == null || (bitmap3 = bitmap2) == null) {
                        return "";
                    }
                    Bitmap combineBitmap = BitmapUtil.combineBitmap(Bitmap.createBitmap(bitmap3), bitmap);
                    Bitmap mergeBitmapMerge = BitmapUtil.mergeBitmapMerge(imageFromPath, null, null, combineBitmap);
                    if (z) {
                        cacheDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                    } else {
                        cacheDir = ShareBizAdapter.getInstance().getAppEnv().b().getCacheDir();
                    }
                    String a2 = oba.a(z, mergeBitmapMerge, cacheDir, context);
                    if (!TextUtils.isEmpty(a2)) {
                        obc.a(context, obc.TAO_PASSWORD_FROM_PIC_SAVE_KEY, str);
                    }
                    if (mergeBitmapMerge != null && !mergeBitmapMerge.isRecycled()) {
                        mergeBitmapMerge.recycle();
                    }
                    if (combineBitmap != null && !combineBitmap.isRecycled()) {
                        combineBitmap.recycle();
                    }
                    return a2;
                }

                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    String str3 = "onPostExecute：" + Thread.currentThread().getName();
                    if (!TextUtils.isEmpty(str2)) {
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(str2);
                        }
                    } else {
                        a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.a(context);
                        }
                    }
                    super.onPostExecute(str2);
                }
            }.execute(new Void[0]);
        }
    }

    private void a(final boolean z, final Context context, final TBShareContent tBShareContent, final Bitmap bitmap, final a aVar, final String str, final Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca88eb6", new Object[]{this, new Boolean(z), context, tBShareContent, bitmap, aVar, str, bitmap2});
        } else {
            com.taobao.runtimepermission.f.a(context, obl.a()).b("tb_share").a(true).a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17841)).b(new Runnable() { // from class: com.taobao.tao.handler.worker.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.b(context);
                }
            }).a(new Runnable() { // from class: com.taobao.tao.handler.worker.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.tao.handler.worker.e$3$1] */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        new AsyncTask<Void, Void, String>() { // from class: com.taobao.tao.handler.worker.e.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                                if (str2.hashCode() == -1325021319) {
                                    super.onPostExecute(objArr[0]);
                                    return null;
                                }
                                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                            }

                            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
                            @Override // android.os.AsyncTask
                            public /* synthetic */ String doInBackground(Void[] voidArr) {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                            }

                            @Override // android.os.AsyncTask
                            public /* synthetic */ void onPostExecute(String str2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("b105c779", new Object[]{this, str2});
                                } else {
                                    a(str2);
                                }
                            }

                            public String a(Void... voidArr) {
                                File cacheDir;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (String) ipChange3.ipc$dispatch("45c9f3cc", new Object[]{this, voidArr});
                                }
                                String str2 = "doInBackground：" + Thread.currentThread().getName();
                                Bitmap imageFromPath = ShareUtils.imageFromPath(tBShareContent.screenshot);
                                if (imageFromPath == null || bitmap == null || bitmap2 == null) {
                                    return "";
                                }
                                Bitmap combineBitmap = BitmapUtil.combineBitmap(Bitmap.createBitmap(bitmap2), bitmap);
                                Bitmap mergeBitmapMerge = BitmapUtil.mergeBitmapMerge(imageFromPath, null, null, combineBitmap);
                                if (z) {
                                    cacheDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                                } else {
                                    cacheDir = ShareBizAdapter.getInstance().getAppEnv().b().getCacheDir();
                                }
                                String a2 = oba.a(z, mergeBitmapMerge, cacheDir, context);
                                if (!TextUtils.isEmpty(a2)) {
                                    obc.a(context, obc.TAO_PASSWORD_FROM_PIC_SAVE_KEY, str);
                                }
                                if (mergeBitmapMerge != null && !mergeBitmapMerge.isRecycled()) {
                                    mergeBitmapMerge.recycle();
                                }
                                if (combineBitmap != null && !combineBitmap.isRecycled()) {
                                    combineBitmap.recycle();
                                }
                                return a2;
                            }

                            public void a(String str2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                                    return;
                                }
                                String str3 = "onPostExecute：" + Thread.currentThread().getName();
                                if (!TextUtils.isEmpty(str2)) {
                                    if (aVar != null) {
                                        aVar.a(str2);
                                    }
                                } else if (aVar != null) {
                                    aVar.a(context);
                                }
                                super.onPostExecute(str2);
                            }
                        }.execute(new Void[0]);
                    }
                }
            }).a();
        }
    }
}
