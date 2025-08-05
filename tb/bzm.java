package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.poplayer.config.model.style.StyleModel;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.g;
import com.alibaba.poplayer.utils.i;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class bzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-688231472);
    }

    public FrameLayout.LayoutParams a(View view, PopRequest popRequest, i iVar) {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b27229d1", new Object[]{this, view, popRequest, iVar});
        }
        if (view == null || popRequest == null || iVar == null) {
            return null;
        }
        try {
            BaseConfigItem c = d.c(popRequest);
            if (c == null) {
                return null;
            }
            StyleModel styleModel = c.styleConfigs;
            char c2 = 65535;
            if (styleModel != null && styleModel.isValid()) {
                Context context = view.getContext();
                if ("fullscreen".equals(styleModel.layout)) {
                    return new FrameLayout.LayoutParams(-1, -1);
                }
                float a2 = a(context, iVar, styleModel.width);
                float a3 = a(context, iVar, styleModel.height);
                float a4 = iVar.a(context, Float.parseFloat(styleModel.offsetLeft));
                float a5 = iVar.a(context, Float.parseFloat(styleModel.offsetRight));
                float c3 = popRequest.c() + iVar.a(context, Float.parseFloat(styleModel.offsetTop));
                float a6 = iVar.a(context, Float.parseFloat(styleModel.offsetBottom));
                layoutParams = new FrameLayout.LayoutParams((int) a2, (int) a3);
                try {
                    String str = styleModel.layout;
                    switch (str.hashCode()) {
                        case -1436089959:
                            if (str.equals("rightTop")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -1364013995:
                            if (str.equals("center")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -901823641:
                            if (str.equals("rightBottom")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case -632276239:
                            if (str.equals("bottomFloat")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case 55433166:
                            if (str.equals("leftTop")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1626916114:
                            if (str.equals("leftBottom")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 == 0) {
                        layoutParams.gravity = 17;
                        layoutParams.leftMargin = (int) a4;
                        layoutParams.topMargin = (int) c3;
                        return layoutParams;
                    } else if (c2 == 1) {
                        layoutParams.gravity = 51;
                        layoutParams.leftMargin = (int) a4;
                        layoutParams.topMargin = (int) c3;
                        return layoutParams;
                    } else if (c2 == 2) {
                        layoutParams.gravity = 53;
                        layoutParams.rightMargin = (int) a5;
                        layoutParams.topMargin = (int) c3;
                        return layoutParams;
                    } else if (c2 == 3) {
                        layoutParams.gravity = 83;
                        layoutParams.leftMargin = (int) a4;
                        layoutParams.bottomMargin = (int) a6;
                        return layoutParams;
                    } else if (c2 == 4) {
                        layoutParams.gravity = 85;
                        layoutParams.rightMargin = (int) a5;
                        layoutParams.bottomMargin = (int) a6;
                        return layoutParams;
                    } else if (c2 != 5) {
                        return layoutParams;
                    } else {
                        layoutParams.gravity = 83;
                        layoutParams.leftMargin = (int) a4;
                        layoutParams.bottomMargin = ((int) a6) + g.a(context, 48);
                        return layoutParams;
                    }
                } catch (Throwable th) {
                    th = th;
                    c.a("PopViewStyle.getPopViewStyle.error", th);
                    return layoutParams;
                }
            }
            return new FrameLayout.LayoutParams(-1, -1);
        } catch (Throwable th2) {
            th = th2;
            layoutParams = null;
        }
    }

    private int a(Context context, i iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4469bcaf", new Object[]{this, context, iVar, str})).intValue();
        }
        try {
            if ("100%".equals(str)) {
                return -1;
            }
            return (int) iVar.a(context, !TextUtils.isEmpty(str) ? Float.parseFloat(str) : 0.0f);
        } catch (Throwable th) {
            c.a("transWidthAndHeight.error.", th);
            return 0;
        }
    }
}
