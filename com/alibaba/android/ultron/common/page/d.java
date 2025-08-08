package com.alibaba.android.ultron.common.page;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.widget.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import tb.bim;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f2524a;
    private Activity b;
    private TBErrorView c;
    private Boolean d = null;

    static {
        kge.a(-1785315978);
        kge.a(-299814411);
    }

    public d(LinearLayout linearLayout, UltronCommonActivity ultronCommonActivity) {
        this.b = ultronCommonActivity;
        this.f2524a = linearLayout;
    }

    public void a(final i iVar, Context context, int i, bim bimVar) {
        TBErrorView tBErrorView;
        TBErrorView tBErrorView2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97889769", new Object[]{this, iVar, context, new Integer(i), bimVar});
        } else if (i != 1) {
            if (i != 2 || (tBErrorView2 = this.c) == null) {
                return;
            }
            tBErrorView2.setVisibility(8);
        } else if (!iVar.b()) {
            if (bimVar != null) {
                z = bimVar.a();
            }
            Boolean bool = this.d;
            if (bool != null && z != bool.booleanValue() && (tBErrorView = this.c) != null) {
                this.f2524a.removeView(tBErrorView);
                this.c = null;
            }
            if (this.c == null) {
                this.c = new TBErrorView(context);
                this.c.setBackgroundResource(R.color.COLOR_F2);
                this.f2524a.addView(this.c, new LinearLayout.LayoutParams(-1, -1));
                this.c.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "重试", new View.OnClickListener() { // from class: com.alibaba.android.ultron.common.page.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            iVar.a();
                        }
                    }
                });
            }
            this.c.setVisibility(0);
            if (bimVar != null) {
                Error fromMtopResponse = Error.Factory.fromMtopResponse(bimVar.b(), bimVar.c(), bimVar.d(), bimVar.e());
                this.c.setError(fromMtopResponse);
                this.d = Boolean.valueOf(z);
                if (z) {
                    this.c.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
                    this.c.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 0);
                    return;
                }
                this.c.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
                this.c.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                this.c.setTitle(bimVar.e());
                fromMtopResponse.errorMsg = " ";
                this.c.setSubTitle(" ");
                return;
            }
            this.c.setError(Error.Factory.fromMtopResponse(-1, "-1", "-1", "unknow error"));
        } else {
            a.a(context, (bimVar == null || StringUtils.isEmpty(bimVar.e())) ? "亲，您的网络状况不太好哦!" : bimVar.e());
        }
    }
}
