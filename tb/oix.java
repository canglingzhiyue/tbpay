package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.tao.handler.worker.e;
import com.taobao.tao.sharepanel.normal.view.b;
import com.taobao.tao.util.AnalyticsUtil;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;

/* loaded from: classes8.dex */
public class oix extends oio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b b;

    static {
        kge.a(-1594988341);
    }

    public static /* synthetic */ Object ipc$super(oix oixVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(oix oixVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f92d4ce", new Object[]{oixVar, context});
        } else {
            oixVar.a(context);
        }
    }

    public static /* synthetic */ void a(oix oixVar, Context context, com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570a5507", new Object[]{oixVar, context, bVar});
        } else {
            oixVar.a(context, bVar);
        }
    }

    public oix(oif oifVar) {
        super(oifVar);
    }

    @Override // tb.oio
    public boolean b(Context context, com.taobao.share.globalmodel.b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3095705c", new Object[]{this, context, bVar, new Integer(i), bVar2})).booleanValue() : bVar != null && (TextUtils.equals(ShareTargetType.Share2Weixin.getValue(), bVar.b()) || TextUtils.equals(ShareTargetType.Share2QQ.getValue(), bVar.b()));
    }

    @Override // tb.oio
    public void c(final Context context, final com.taobao.share.globalmodel.b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92230b7", new Object[]{this, context, bVar, new Integer(i), bVar2});
            return;
        }
        if (bVar2.f19682a instanceof b) {
            this.b = (b) bVar2.f19682a;
        }
        TBShareContent j = e.b().j();
        if (bVar == null) {
            return;
        }
        if (!TextUtils.equals(ShareTargetType.Share2Weixin.getValue(), bVar.b()) && !TextUtils.equals(ShareTargetType.Share2QQ.getValue(), bVar.b())) {
            return;
        }
        if (nyk.b(j.businessId)) {
            this.f32103a.a(bVar.b(), true, new e.a() { // from class: tb.oix.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.handler.worker.e.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    oup.e();
                    oix.a(oix.this, context, bVar);
                }

                @Override // com.taobao.tao.handler.worker.e.a
                public void a(Context context2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9e1d6460", new Object[]{this, context2});
                        return;
                    }
                    oup.c();
                    oix.a(oix.this, context2);
                }

                @Override // com.taobao.tao.handler.worker.e.a
                public void b(Context context2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9eca0fff", new Object[]{this, context2});
                        return;
                    }
                    oup.d();
                    oix.a(oix.this, context2);
                }
            });
        } else {
            a(context, bVar);
        }
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

    private void a(Context context, com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a21c99", new Object[]{this, context, bVar});
            return;
        }
        AnalyticsUtil.wxAndQQOnClick(bVar);
        b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.e().d();
        } else {
            oup.a(0);
        }
        if (this.b != null) {
            if (!TextUtils.equals("common", com.taobao.share.globalmodel.e.b().j().templateId)) {
                this.f32103a.a(context, bVar);
            } else {
                this.f32103a.b(context, bVar);
            }
            this.b.e().h();
            return;
        }
        this.f32103a.b(context, bVar);
    }
}
