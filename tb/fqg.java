package tb;

import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.android.bindingx.core.i;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.Map;

/* loaded from: classes.dex */
public class fqg implements bbp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(305968239);
        kge.a(932468357);
    }

    @Override // tb.bbp
    public void a(final View view, String str, final Object obj, i.b bVar, Map<String, Object> map) {
        DinamicXEngine b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            return;
        }
        if (DinamicXEngine.j()) {
            fuw.c("开始更新" + str + " 属性，需要更新到的值为 " + obj + " 更新前的值为 " + a(str, view) + " 其对应的view为 " + view);
        }
        DXWidgetNode b2 = gbh.b(view);
        if (b2 != null && b2.getDXRuntimeContext() != null && (b = b2.getDXRuntimeContext().C().b()) != null && b.B() != null && b.B().a(view, str, obj, bVar, map)) {
            return;
        }
        if (!StringUtils.isEmpty(str) && view != null) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1221029593) {
                if (hashCode == 113126854 && str.equals("width")) {
                    c = 0;
                }
            } else if (str.equals("height")) {
                c = 1;
            }
            if (c == 0) {
                Runnable runnable = new Runnable() { // from class: tb.fqg.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            DXWidgetNode b3 = gbh.b(view);
                            if (b3 == null) {
                                return;
                            }
                            int intValue = Double.valueOf("" + obj).intValue();
                            b3.setMeasuredDimension(intValue, b3.getMeasuredHeight());
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            if (layoutParams == null) {
                                return;
                            }
                            layoutParams.width = intValue;
                            view.setLayoutParams(layoutParams);
                        } catch (Throwable th) {
                            a.b(th);
                        }
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable.run();
                    return;
                } else {
                    fxe.a(runnable);
                    return;
                }
            } else if (c == 1) {
                Runnable runnable2 = new Runnable() { // from class: tb.fqg.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            DXWidgetNode b3 = gbh.b(view);
                            if (b3 == null) {
                                return;
                            }
                            int intValue = Double.valueOf("" + obj).intValue();
                            b3.setMeasuredDimension(b3.getMeasuredWidth(), intValue);
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            if (layoutParams == null) {
                                return;
                            }
                            layoutParams.height = intValue;
                            view.setLayoutParams(layoutParams);
                        } catch (Throwable th) {
                            a.b(th);
                        }
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable2.run();
                    return;
                } else {
                    fxe.a(runnable2);
                    return;
                }
            }
        }
        bbp a2 = bbt.a(str);
        if (a2 != null) {
            a2.a(view, str, obj, bVar, map);
        }
        if (!DinamicXEngine.j()) {
            return;
        }
        fuw.c("更新完成" + str + " 属性，需要更新到的值为 " + obj + " 更新后的值为 " + a(str, view) + " 其对应的view为 " + view);
    }

    private Object a(String str, View view) {
        IpChange ipChange = $ipChange;
        char c = 2;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bce277d2", new Object[]{this, str, view});
        }
        try {
            switch (str.hashCode()) {
                case -1971608035:
                    if (str.equals("transform.rotate")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1954617072:
                    if (str.equals("transform.scaleX")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1954617071:
                    if (str.equals("transform.scaleY")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1744318324:
                    if (str.equals("transform.translateX")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1744318323:
                    if (str.equals("transform.translateY")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1725620152:
                    if (str.equals("transform.scale")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -990306853:
                    if (str.equals("transform.rotateX")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -990306852:
                    if (str.equals("transform.rotateY")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -990306851:
                    if (str.equals("transform.rotateZ")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -194815668:
                    if (str.equals("transform.translate")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 605322756:
                    if (str.equals("background-color")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return "width:" + view.getLayoutParams().width;
                case 1:
                    return "height: " + view.getLayoutParams().height;
                case 2:
                    return "opacity: " + view.getAlpha();
                case 3:
                    return "translateX :" + view.getTranslationX();
                case 4:
                    return "translateY: " + view.getTranslationY();
                case 5:
                    return "translateX :" + view.getTranslationX() + " translateY: " + view.getTranslationY();
                case 6:
                    return "scaleX: " + view.getScaleX();
                case 7:
                    return "scaleY: " + view.getScaleY();
                case '\b':
                    return "scaleX: " + view.getScaleX() + "scaleY: " + view.getScaleY();
                case '\t':
                    return "rotate :" + view.getRotation();
                case '\n':
                    return "rotateZ :" + view.getRotation();
                case 11:
                    return "rotateX :" + view.getRotationX();
                case '\f':
                    return "rotateY :" + view.getRotationY();
                case '\r':
                    if (!(view.getBackground() instanceof ColorDrawable)) {
                        return "targetView.getBackground() 不是ColorDrawable";
                    }
                    return "background-color:  " + ((ColorDrawable) view.getBackground()).getColor();
                case 14:
                    if (!(view instanceof TextView)) {
                        return "targetView 不是TextView";
                    }
                    int currentTextColor = ((TextView) view).getCurrentTextColor();
                    return "textColor:  " + currentTextColor;
            }
        } catch (Exception e) {
            a.b(e);
        }
        return str + " 当前属性不支持";
    }
}
