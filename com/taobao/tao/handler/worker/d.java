package com.taobao.tao.handler.worker;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.util.BitmapUtil;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.nyq;
import tb.oba;
import tb.obc;
import tb.obi;
import tb.obl;
import tb.oif;
import tb.oir;
import tb.ouk;
import tb.oup;

/* loaded from: classes8.dex */
public class d extends oir {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.share.ui.engine.render.b b;
    private com.taobao.tao.sharepanel.normal.view.b c;

    static {
        kge.a(-1725654992);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ com.taobao.tao.sharepanel.normal.view.b a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.sharepanel.normal.view.b) ipChange.ipc$dispatch("b872f07c", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ void a(d dVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d67a47", new Object[]{dVar, context});
        } else {
            dVar.a(context);
        }
    }

    public static /* synthetic */ void a(d dVar, Bitmap bitmap, com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4524ce6", new Object[]{dVar, bitmap, bVar});
        } else {
            dVar.a(bitmap, bVar);
        }
    }

    public static /* synthetic */ oif b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oif) ipChange.ipc$dispatch("c41f04fa", new Object[]{dVar}) : dVar.f32104a;
    }

    public static /* synthetic */ oif c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oif) ipChange.ipc$dispatch("5ebfc77b", new Object[]{dVar}) : dVar.f32104a;
    }

    public static /* synthetic */ oif d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oif) ipChange.ipc$dispatch("f96089fc", new Object[]{dVar}) : dVar.f32104a;
    }

    public d(oif oifVar) {
        super(oifVar);
        this.b = oifVar.b;
        if (this.b.f19682a instanceof com.taobao.tao.sharepanel.normal.view.b) {
            this.c = (com.taobao.tao.sharepanel.normal.view.b) this.b.f19682a;
        }
    }

    public void b(final Context context, final com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e08c38", new Object[]{this, context, bVar});
            return;
        }
        com.taobao.tao.sharepanel.normal.view.b bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.e().e();
        }
        this.b.d.removeCallbacksAndMessages(null);
        AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.handler.worker.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[Catch: Throwable -> 0x0068, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0068, blocks: (B:6:0x0012, B:8:0x001e, B:11:0x0025, B:13:0x0057, B:15:0x005b, B:12:0x004f), top: B:18:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r3 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.handler.worker.d.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L12
                    r1 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r3
                    java.lang.String r2 = "5c510192"
                    r0.ipc$dispatch(r2, r1)
                    return
                L12:
                    java.lang.String r0 = com.taobao.tao.sharegift.a.a()     // Catch: java.lang.Throwable -> L68
                    com.taobao.tao.handler.worker.d r1 = com.taobao.tao.handler.worker.d.this     // Catch: java.lang.Throwable -> L68
                    com.taobao.tao.sharepanel.normal.view.b r1 = com.taobao.tao.handler.worker.d.a(r1)     // Catch: java.lang.Throwable -> L68
                    if (r1 == 0) goto L4f
                    boolean r1 = android.text.StringUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L68
                    if (r1 == 0) goto L25
                    goto L4f
                L25:
                    com.taobao.phenix.intf.b r1 = com.taobao.phenix.intf.b.h()     // Catch: java.lang.Throwable -> L68
                    android.app.Application r2 = com.taobao.tao.config.a.a()     // Catch: java.lang.Throwable -> L68
                    android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L68
                    com.taobao.phenix.intf.b r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L68
                    com.taobao.phenix.intf.PhenixCreator r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L68
                    com.taobao.tao.handler.worker.d$1$2 r1 = new com.taobao.tao.handler.worker.d$1$2     // Catch: java.lang.Throwable -> L68
                    r1.<init>()     // Catch: java.lang.Throwable -> L68
                    com.taobao.phenix.intf.PhenixCreator r0 = r0.succListener(r1)     // Catch: java.lang.Throwable -> L68
                    com.taobao.tao.handler.worker.d$1$1 r1 = new com.taobao.tao.handler.worker.d$1$1     // Catch: java.lang.Throwable -> L68
                    r1.<init>()     // Catch: java.lang.Throwable -> L68
                    com.taobao.phenix.intf.PhenixCreator r0 = r0.failListener(r1)     // Catch: java.lang.Throwable -> L68
                    r0.fetch()     // Catch: java.lang.Throwable -> L68
                    goto L57
                L4f:
                    com.taobao.tao.handler.worker.d r0 = com.taobao.tao.handler.worker.d.this     // Catch: java.lang.Throwable -> L68
                    r1 = 0
                    com.taobao.share.globalmodel.b r2 = r2     // Catch: java.lang.Throwable -> L68
                    com.taobao.tao.handler.worker.d.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L68
                L57:
                    com.taobao.share.globalmodel.b r0 = r2     // Catch: java.lang.Throwable -> L68
                    if (r0 == 0) goto L68
                    com.taobao.tao.handler.worker.d r0 = com.taobao.tao.handler.worker.d.this     // Catch: java.lang.Throwable -> L68
                    tb.oif r0 = com.taobao.tao.handler.worker.d.b(r0)     // Catch: java.lang.Throwable -> L68
                    android.content.Context r1 = r3     // Catch: java.lang.Throwable -> L68
                    com.taobao.share.globalmodel.b r2 = r2     // Catch: java.lang.Throwable -> L68
                    r0.b(r1, r2)     // Catch: java.lang.Throwable -> L68
                L68:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.handler.worker.d.AnonymousClass1.run():void");
            }
        });
    }

    public void a(final Context context, final com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a21c99", new Object[]{this, context, bVar});
            return;
        }
        com.taobao.tao.sharepanel.normal.view.b bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.e().e();
        }
        this.b.d.removeCallbacksAndMessages(null);
        com.taobao.runtimepermission.f.a(context, obl.a()).b("tb_share").a(true).a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17841)).a(true).b(new Runnable() { // from class: com.taobao.tao.handler.worker.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                d.a(d.this, context);
                if (d.a(d.this) != null) {
                    d.a(d.this).e().h();
                }
                if (bVar == null) {
                    return;
                }
                d.d(d.this).b(context, bVar);
            }
        }).a(new Runnable() { // from class: com.taobao.tao.handler.worker.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String a2 = com.taobao.tao.sharegift.a.a();
                if (d.a(d.this) == null || StringUtils.isEmpty(a2)) {
                    d.a(d.this, null, bVar);
                } else {
                    com.taobao.phenix.intf.b.h().a(com.taobao.tao.config.a.a().getApplicationContext()).a(a2).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.handler.worker.d.2.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.phenix.intf.event.a
                        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                        }

                        public boolean a(SuccPhenixEvent succPhenixEvent) {
                            Bitmap bitmap;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                            }
                            if (succPhenixEvent.getDrawable() != null && (bitmap = succPhenixEvent.getDrawable().getBitmap()) != null) {
                                d.a(d.this, bitmap, bVar);
                            }
                            return true;
                        }
                    }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.handler.worker.d.2.1
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
                            d.a(d.this, null, bVar);
                            return false;
                        }
                    }).fetch();
                }
                if (bVar == null) {
                    return;
                }
                d.c(d.this).b(context, bVar);
            }
        }).a();
    }

    private void a(Bitmap bitmap, com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58292ff", new Object[]{this, bitmap, bVar});
            return;
        }
        if (bVar == null) {
            bVar = this.b.f;
        }
        com.taobao.tao.sharepanel.normal.view.b bVar2 = this.c;
        if (bVar2 == null || bVar2.f() == null) {
            if (bVar == null || (!StringUtils.equals(ShareTargetType.Share2QQ.getValue(), bVar.b()) && !StringUtils.equals(ShareTargetType.Share2Weixin.getValue(), bVar.b()))) {
                z = false;
            }
            new a(this.f32104a, bitmap, z).execute(new Void[0]);
            return;
        }
        this.c.e().f();
        new a(bitmap, this.c.f()).execute(new Void[0]);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            Toast makeText = Toast.makeText(context, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17885), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends AsyncTask<Void, Void, String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Bitmap f20571a;
        private Bitmap b;
        private boolean c;
        private boolean d;
        private ouk e;
        private Bitmap f;
        private String g;
        private CountDownLatch h;
        private boolean i;
        private oif j;

        static {
            kge.a(-177548421);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ Bitmap a(a aVar, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("a9bbbb08", new Object[]{aVar, bitmap});
            }
            aVar.f20571a = bitmap;
            return bitmap;
        }

        public static /* synthetic */ CountDownLatch a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("f5118d6a", new Object[]{aVar}) : aVar.h;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
        @Override // android.os.AsyncTask
        public /* synthetic */ String doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, str});
            } else {
                a(str);
            }
        }

        public a(Bitmap bitmap, ouk oukVar) {
            Bitmap bitmap2 = null;
            this.f20571a = null;
            this.i = false;
            this.b = bitmap;
            this.e = oukVar;
            this.g = com.taobao.share.globalmodel.e.b().j().validateTime;
            this.f = oukVar != null ? oukVar.a() : bitmap2;
        }

        public a(oif oifVar, Bitmap bitmap, boolean z) {
            this.f20571a = null;
            this.i = false;
            this.b = bitmap;
            this.g = com.taobao.share.globalmodel.e.b().j().validateTime;
            this.c = oifVar.b.e;
            this.j = oifVar;
            this.d = z;
            if (oifVar.b.c != null) {
                this.i = oifVar.b.c.b();
                this.f = oifVar.b.c.a();
            }
        }

        public String a(Void... voidArr) {
            File cacheDir;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("45c9f3cc", new Object[]{this, voidArr});
            }
            ouk oukVar = this.e;
            Bitmap b = oukVar != null ? oukVar.b() : null;
            if (this.f == null) {
                return "";
            }
            String g = obi.b.g();
            if (!StringUtils.isEmpty(g)) {
                this.h = new CountDownLatch(1);
                com.taobao.phenix.intf.b.h().a(g).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.handler.worker.d.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                            BitmapDrawable drawable = succPhenixEvent.getDrawable();
                            if (drawable instanceof com.taobao.phenix.cache.memory.f) {
                                ((com.taobao.phenix.cache.memory.f) drawable).a();
                            }
                            a.a(a.this, drawable.getBitmap());
                        }
                        a.a(a.this).countDown();
                        return false;
                    }
                }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.handler.worker.d.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                    }

                    public boolean a(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                        }
                        a.a(a.this).countDown();
                        return false;
                    }
                }).fetch();
                if (this.h.getCount() > 0) {
                    try {
                        this.h.await(3000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            Application a2 = com.taobao.tao.config.a.a();
            try {
                this.f20571a = BitmapUtil.drawTextAtBitmap(a2, this.f20571a, this.g, nyq.a(a2, 270.0f), nyq.a(a2, 225.0f));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.i) {
                this.f = BitmapUtil.mergeBitmapMerge(this.f, this.b, b, null);
            } else {
                this.f = BitmapUtil.mergeBitmapMerge(this.f, this.b, b, this.f20571a);
            }
            if (!this.c || this.d) {
                z = true;
            }
            if (z) {
                cacheDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            } else {
                cacheDir = ShareBizAdapter.getInstance().getAppEnv().b().getCacheDir();
            }
            String a3 = oba.a(z, this.f, cacheDir, a2);
            Bitmap bitmap = this.f;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f.recycle();
            }
            return a3;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            super.onPostExecute(str);
            boolean z = !StringUtils.isEmpty(str);
            Application a2 = com.taobao.tao.config.a.a();
            oup.a(str);
            if (z) {
                if (this.d || !this.c) {
                    Toast makeText = Toast.makeText(a2, R.string.share_str_save_img_toast, 1);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                }
                if (this.c) {
                    this.j.a(str);
                }
                ouk oukVar = this.e;
                if (oukVar != null && !StringUtils.isEmpty(oukVar.c())) {
                    obc.a(a2, obc.TAO_PASSWORD_FROM_PIC_SAVE_KEY, this.e.c());
                    return;
                } else if (!(ShareBizAdapter.getInstance().getShareEngine().mo1241getCurSharePanel() instanceof com.taobao.tao.sharepanel.weex.a)) {
                    return;
                } else {
                    obc.a(a2, obc.TAO_PASSWORD_FROM_PIC_SAVE_KEY, ((com.taobao.tao.sharepanel.weex.a) ShareBizAdapter.getInstance().getShareEngine().mo1241getCurSharePanel()).a().b());
                    return;
                }
            }
            Toast makeText2 = Toast.makeText(a2, R.string.share_str_save_img_fail_tosat, 1);
            makeText2.setGravity(17, 0, 0);
            makeText2.show();
        }
    }
}
