package tb;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.g;
import com.taobao.android.detail.ttdetail.bizmessage.k;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.s;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.event.a;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.stdpop.api.b;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.d;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class kvo extends s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f30343a;
    private eyx b;
    private long c;

    static {
        kge.a(1776599850);
    }

    public static /* synthetic */ Object ipc$super(kvo kvoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ long a(kvo kvoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1ddc3e8", new Object[]{kvoVar})).longValue() : kvoVar.c;
    }

    public static /* synthetic */ Context b(kvo kvoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("27425a6d", new Object[]{kvoVar}) : kvoVar.f30343a;
    }

    public kvo(Context context, eyx eyxVar) {
        super(context, eyxVar);
        this.f30343a = context;
        this.b = eyxVar;
    }

    @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.s, tb.ezm
    public boolean a(a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        this.c = System.currentTimeMillis();
        if (this.b.a().c()) {
            Toast.makeText(this.f30343a, "信息加载中,客官请稍等...", 0).show();
            return true;
        } else if (!(this.f30343a instanceof FragmentActivity)) {
            i.a("OpenTaobaoRateImplementor", "showRateFeedsFragment failed because the page is not FragmentActivity");
            return false;
        } else {
            mqw a2 = mqx.a(aVar, false, this.c, runtimeAbilityParamArr);
            a2.b(mqx.a(a2.g()) ? "pop" : "default");
            a(a2);
            return true;
        }
    }

    private boolean a(final mqw mqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f504a2a9", new Object[]{this, mqwVar})).booleanValue();
        }
        if (e.a(this.f30343a)) {
            return mqx.a(this.f30343a, this.b, mqwVar);
        }
        FragmentActivity fragmentActivity = (FragmentActivity) this.f30343a;
        d a2 = mqx.a(this.b, mqwVar);
        Context context = this.f30343a;
        if (context instanceof kvr) {
            kvr kvrVar = (kvr) context;
            if (kvrVar.e()) {
                a2.a(kvrVar.f().get(0));
            }
        }
        int b = a2.b();
        if (mqx.a(mqwVar.g())) {
            a(fragmentActivity, a2.a(), mqwVar.g(), b);
            return true;
        }
        a2.a(new RateFeedsFragment.b() { // from class: tb.kvo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.detail.rate.RateFeedsFragment.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                i.a("OpenTaobaoRateImplementor", "openRate invokeOnShow: " + (System.currentTimeMillis() - kvo.a(kvo.this)));
                c.a(kvo.b(kvo.this), k.a(mqwVar.h(), mqwVar.i()));
            }

            @Override // com.taobao.detail.rate.RateFeedsFragment.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    c.a(kvo.b(kvo.this), g.a());
                }
            }
        });
        Fragment a3 = a2.a();
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.setCustomAnimations(R.anim.tt_detail_activity_open_enter, 0, 0, R.anim.tt_detail_activity_close_exit);
        beginTransaction.add(R.id.fl_tt_detail_fragment_container, a3, "DetailCommentFragment");
        beginTransaction.addToBackStack(null);
        beginTransaction.commitAllowingStateLoss();
        try {
            supportFragmentManager.executePendingTransactions();
            i.a("OpenTaobaoRateImplementor", "openRate CodeTime: " + (System.currentTimeMillis() - this.c));
        } catch (Exception e) {
            i.a("OpenTaobaoRateImplementor", "showRateFeedsFragment executePendingTransactions exception", e);
        }
        return true;
    }

    private void a(FragmentActivity fragmentActivity, Fragment fragment, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0675eaa", new Object[]{this, fragmentActivity, fragment, jSONObject, new Integer(i)});
            return;
        }
        float floatValue = (jSONObject == null || jSONObject.isEmpty() || jSONObject.getFloatValue("maxHeight") == 0.0f) ? 0.8f : jSONObject.getFloatValue("maxHeight");
        String string = (jSONObject == null || jSONObject.isEmpty() || StringUtils.isEmpty(jSONObject.getString("title"))) ? "评价" : jSONObject.getString("title");
        com.taobao.android.stdpop.api.c cVar = new com.taobao.android.stdpop.api.c();
        cVar.a(floatValue);
        cVar.a(string);
        cVar.a(false);
        cVar.b("DetailCommentFragment");
        cVar.a(i);
        View findViewById = fragmentActivity.findViewById(R.id.ll_tt_detail_bottom_bar);
        if (findViewById != null) {
            cVar.a(new b(0.0f, 0.0f, 0.0f, f.b(findViewById.getHeight())));
        }
        scr a2 = cVar.a(fragmentActivity, fragment, new com.taobao.android.stdpop.api.a() { // from class: tb.kvo.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 40303496) {
                    super.a((JSONObject) objArr[0]);
                    return null;
                } else if (hashCode != 1673107495) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.b((JSONObject) objArr[0]);
                    return null;
                }
            }

            @Override // com.taobao.android.stdpop.api.a, tb.scq
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                } else {
                    super.a(jSONObject2);
                }
            }

            @Override // com.taobao.android.stdpop.api.a, tb.scq
            public void b(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject2});
                } else {
                    super.b(jSONObject2);
                }
            }
        });
        i.a("OpenTaobaoRateImplementor", "showRatePopFragment result isSuccess=" + a2.f33478a + ", errorCode=" + a2.b + ", errorMsg=" + a2.c);
    }
}
