package tb;

import android.content.Context;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.globalmodel.e;
import com.taobao.share.taopassword.constants.a;
import com.taobao.tao.handler.worker.e;
import com.taobao.tao.sharepanel.normal.view.b;
import com.taobao.tao.util.AnalyticsUtil;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;

/* loaded from: classes8.dex */
public class oiw extends oio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b b;
    private com.taobao.share.ui.engine.render.b c;

    static {
        kge.a(190772100);
    }

    public static /* synthetic */ Object ipc$super(oiw oiwVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ com.taobao.share.ui.engine.render.b a(oiw oiwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.share.ui.engine.render.b) ipChange.ipc$dispatch("b8b6540e", new Object[]{oiwVar}) : oiwVar.c;
    }

    public static /* synthetic */ void a(oiw oiwVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5642f04d", new Object[]{oiwVar, context});
        } else {
            oiwVar.a(context);
        }
    }

    public static /* synthetic */ void a(oiw oiwVar, com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9da414", new Object[]{oiwVar, bVar});
        } else {
            oiwVar.a(bVar);
        }
    }

    public oiw(oif oifVar) {
        super(oifVar);
    }

    @Override // tb.oio
    public boolean b(Context context, com.taobao.share.globalmodel.b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3095705c", new Object[]{this, context, bVar, new Integer(i), bVar2})).booleanValue();
        }
        return bVar != null && StringUtils.equals((bVar == null ? ComponentType.CONTACT_ITEM : bVar.c()).desc, ComponentType.CHANNEL_ITEM.desc);
    }

    @Override // tb.oio
    public void c(Context context, final com.taobao.share.globalmodel.b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92230b7", new Object[]{this, context, bVar, new Integer(i), bVar2});
            return;
        }
        this.c = bVar2;
        if (bVar2.f19682a instanceof b) {
            this.b = (b) bVar2.f19682a;
        }
        String str = (bVar == null ? ComponentType.CONTACT_ITEM : bVar.c()).desc;
        if (bVar == null || !StringUtils.equals(str, ComponentType.CHANNEL_ITEM.desc)) {
            return;
        }
        if (nyk.b(e.b().j().businessId)) {
            String str2 = "isScreenShot:" + Thread.currentThread().getName();
            this.f32103a.a(bVar.b(), false, new e.a() { // from class: tb.oiw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.handler.worker.e.a
                public void a(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                        return;
                    }
                    String str4 = "saveSuccess:" + Thread.currentThread().getName();
                    com.taobao.share.globalmodel.e.b().j().imgPath = str3;
                    oiw.a(oiw.this, bVar);
                }

                @Override // com.taobao.tao.handler.worker.e.a
                public void a(Context context2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9e1d6460", new Object[]{this, context2});
                    } else {
                        oiw.a(oiw.this, context2);
                    }
                }

                @Override // com.taobao.tao.handler.worker.e.a
                public void b(Context context2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9eca0fff", new Object[]{this, context2});
                    } else {
                        oiw.a(oiw.this, context2);
                    }
                }
            });
            return;
        }
        a(bVar);
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

    private void a(final com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8f04a1", new Object[]{this, bVar});
            return;
        }
        oig.a(bVar.b(), null);
        AnalyticsUtil.traceViewClickOthers(bVar, com.taobao.share.globalmodel.e.b().j().url);
        if (this.b != null) {
            if (StringUtils.equals(ShareTargetType.Share2Copy.getValue(), bVar.b())) {
                this.b.e().d();
                this.b.e().i();
                new Handler().postDelayed(new Runnable() { // from class: tb.oiw.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (oiw.a(oiw.this) == null) {
                        } else {
                            oiw.a(oiw.this).a();
                        }
                    }
                }, 500L);
                return;
            }
            b bVar2 = this.b;
            if (StringUtils.equals(ShareTargetType.Share2QRCode.getValue(), bVar.b()) || StringUtils.equals(ShareTargetType.Share2ScanCode.getValue(), bVar.b())) {
                z = false;
            }
            bVar2.b = z;
            com.taobao.share.ui.engine.render.b bVar3 = this.c;
            if (bVar3 == null) {
                return;
            }
            bVar3.a();
            return;
        }
        new Handler().postDelayed(new Runnable() { // from class: tb.oiw.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (oiw.a(oiw.this) == null) {
                } else {
                    if ((StringUtils.equals(ShareTargetType.Share2Copy.getValue(), bVar.b()) && a.c) || a.d) {
                        oup.b(bVar.b(), "code");
                        return;
                    }
                    oup.b(bVar.b(), null);
                    oiw.a(oiw.this).a();
                }
            }
        }, 500L);
    }
}
