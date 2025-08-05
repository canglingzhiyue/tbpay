package com.taobao.errorview.mega;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsErrorViewWidgetAbility;
import com.taobao.android.abilityidl.ability.ErrorViewWidgetRequestError;
import com.taobao.android.abilityidl.ability.fz;
import com.taobao.android.abilityidl.ability.gd;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import com.taobao.uikit.extend.component.error.Error;
import tb.als;
import tb.alt;
import tb.gml;
import tb.kge;

/* loaded from: classes7.dex */
public class ErrorViewWidgetAbility extends AbsErrorViewWidgetAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f17102a;

    static {
        kge.a(1507495969);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsErrorViewWidgetAbility
    public void show(als alsVar, final fz fzVar, final gd gdVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6389e5", new Object[]{this, alsVar, fzVar, gdVar});
        } else if (this.f17102a != null) {
            TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "widget already exists");
        } else {
            Activity a2 = a(alsVar);
            if (a2 == null) {
                TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "activity is null");
                gdVar.a(new ErrorResult("ERROR", "activity is null"));
                return;
            }
            String str = fzVar.f8879a;
            int max = Math.max(0, fzVar.b);
            int a3 = a(fzVar.c);
            Error a4 = a(fzVar.d);
            String str2 = fzVar.e;
            String str3 = fzVar.f;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.taobao.errorview.mega.ErrorViewWidgetAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        gdVar.a(fzVar.d);
                    }
                }
            };
            if (!TextUtils.isEmpty(str3) && !str3.contains("刷新") && !str3.toLowerCase().contains("refresh")) {
                z = false;
            }
            TBErrorViewWidget tBErrorViewWidget = new TBErrorViewWidget(a2);
            tBErrorViewWidget.setTopic(str);
            tBErrorViewWidget.setStatus(TBErrorViewWidget.Status.STATUS_CUSTOM);
            tBErrorViewWidget.setCustomTitle(str2);
            tBErrorViewWidget.setCustomEnableButtons(a3);
            if (z) {
                tBErrorViewWidget.setRefreshButtonWithProgress(str3, str3, onClickListener);
            } else {
                tBErrorViewWidget.setRefreshButtonWithoutProgress(str3, onClickListener);
            }
            tBErrorViewWidget.setError(a4);
            this.f17102a = new FrameLayout(a2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(TBErrorViewWidget.getSuggestedWidth(a2), -2);
            layoutParams.gravity = 81;
            layoutParams.setMargins(0, 0, 0, TBErrorViewWidget.dp2px(a2, max));
            this.f17102a.addView(tBErrorViewWidget, layoutParams);
            this.f17102a.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.errorview.mega.ErrorViewWidgetAbility.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    return false;
                }
            });
            a2.addContentView(this.f17102a, new ViewGroup.MarginLayoutParams(-1, -1));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsErrorViewWidgetAbility
    public void dismiss(als alsVar, gml gmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb75b443", new Object[]{this, alsVar, gmlVar});
            return;
        }
        FrameLayout frameLayout = this.f17102a;
        if (frameLayout != null) {
            ViewGroup viewGroup = (ViewGroup) frameLayout.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f17102a);
            } else {
                TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "parent view container is null");
            }
            this.f17102a = null;
            return;
        }
        TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "widget is null");
    }

    private static Activity a(als alsVar) {
        Context f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("da392478", new Object[]{alsVar});
        }
        alt b = alsVar.b();
        if (b != null && (f = b.f()) != null && (f instanceof Activity)) {
            return (Activity) f;
        }
        return null;
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if ("BUTTON_STYLE_NONE".equals(str)) {
            return 0;
        }
        if ("BUTTON_STYLE_ALL".equals(str)) {
            return 7;
        }
        return "BUTTON_STYLE_FEEDBACK".equals(str) ? 2 : 6;
    }

    private static Error a(ErrorViewWidgetRequestError errorViewWidgetRequestError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Error) ipChange.ipc$dispatch("66c0b0c0", new Object[]{errorViewWidgetRequestError});
        }
        int i = -1;
        if (!TextUtils.isEmpty(errorViewWidgetRequestError.responseCode)) {
            try {
                i = Integer.parseInt(errorViewWidgetRequestError.responseCode);
            } catch (Exception unused) {
            }
        }
        return Error.Factory.fromMtopResponse(errorViewWidgetRequestError.api, i, errorViewWidgetRequestError.mappingCode, errorViewWidgetRequestError.code, errorViewWidgetRequestError.message);
    }
}
