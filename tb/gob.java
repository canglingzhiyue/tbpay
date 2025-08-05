package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.ability.localization.b;
import com.alibaba.android.icart.core.widget.d;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bga;

/* loaded from: classes5.dex */
public class gob implements bfd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f28404a;
    private TBErrorView b;
    private aat c;

    static {
        kge.a(-1082041354);
        kge.a(-1461353125);
    }

    public static /* synthetic */ TBErrorView a(gob gobVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBErrorView) ipChange.ipc$dispatch("1a2884f7", new Object[]{gobVar}) : gobVar.b;
    }

    public static /* synthetic */ aat b(gob gobVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aat) ipChange.ipc$dispatch("2ef2ad33", new Object[]{gobVar}) : gobVar.c;
    }

    public gob(LinearLayout linearLayout, aat aatVar) {
        this.f28404a = linearLayout;
        this.c = aatVar;
    }

    @Override // tb.bfd
    public void a(bbz bbzVar, Context context, int i, MtopResponse mtopResponse, boolean z) {
        TBErrorView tBErrorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece7f9f6", new Object[]{this, bbzVar, context, new Integer(i), mtopResponse, new Boolean(z)});
        } else if (i != 1) {
            if (i != 3 || (tBErrorView = this.b) == null) {
                return;
            }
            tBErrorView.setVisibility(8);
        } else {
            boolean E = this.c.h().E();
            if (!E) {
                if (this.b == null) {
                    this.b = new TBErrorView(context);
                    this.b.setBackgroundResource(R.color.taobao_cart_background);
                    this.f28404a.addView(this.b, new LinearLayout.LayoutParams(-1, -1));
                    this.b.setButton(TBErrorView.ButtonType.BUTTON_LEFT, b.a(R.string.app_retry), new View.OnClickListener() { // from class: tb.gob.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            gob.a(gob.this).setVisibility(8);
                            gob.b(gob.this).h().S().l();
                        }
                    });
                }
                this.b.setVisibility(0);
                this.b.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
                bpp.a().commitFeedback("iCart", mtopResponse.getRetMsg(), UmTypeKey.ERROE_PAGE, mtopResponse.getRetCode(), mtopResponse.getMappingCode());
                bga.a.b("iCart", "hasNoContentErrorPage", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            }
            if (!E) {
                return;
            }
            String a2 = b.a(R.string.app_network_error);
            if (mtopResponse != null && !TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                a2 = mtopResponse.getRetMsg();
            }
            String str = a2;
            boolean equals = "DISABLE_TOAST".equals(mtopResponse == null ? "" : mtopResponse.getRetCode());
            if (z && !equals) {
                d.a(context, str);
            }
            bed.a("showErrorView", "显示统一错误页", true, 1.0f);
            bpp.a().commitFeedback("iCart", str, UmTypeKey.TOAST, mtopResponse.getRetCode(), mtopResponse.getMappingCode());
        }
    }

    @Override // tb.bfd
    public void a(bbz bbzVar, Context context, int i, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff624c9e", new Object[]{this, bbzVar, context, new Integer(i), mtopResponse});
        } else {
            a(bbzVar, context, i, mtopResponse, true);
        }
    }
}
