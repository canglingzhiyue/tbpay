package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.c;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import com.taobao.prefork.a;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;

/* loaded from: classes7.dex */
public class lmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1205188461);
    }

    public boolean a(ljs ljsVar, lmk lmkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("829142d", new Object[]{this, ljsVar, lmkVar})).booleanValue();
        }
        if (!lmkVar.p()) {
            ldf.d("LiveCardConfigHelper", "tbPlayVideo attr is false");
            return false;
        }
        return a(ljsVar);
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        Context b = b(context);
        c a2 = c.a(b, "homepage");
        if (a2 == null) {
            return false;
        }
        return a2.b().a(b);
    }

    public boolean a(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe9598e", new Object[]{this, tBLiveOpenCardView})).booleanValue();
        }
        if (tBLiveOpenCardView == null) {
            ldf.d("LiveCardConfigHelper", "live image view is null");
            return false;
        } else if (tBLiveOpenCardView.getVisibility() != 0) {
            ldf.d("LiveCardConfigHelper", "live image view is not visible");
            return false;
        } else if (b(tBLiveOpenCardView.getContext()) != null) {
            return true;
        } else {
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            sb.append("can not find activity context。current context = ");
            sb.append(tBLiveOpenCardView.getContext() == null ? "null" : tBLiveOpenCardView.getContext().getClass().getSimpleName());
            strArr[0] = sb.toString();
            ldf.d("LiveCardConfigHelper", strArr);
            return false;
        }
    }

    public boolean a(TBLiveOpenCardView tBLiveOpenCardView, lmk lmkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd68a2b4", new Object[]{this, tBLiveOpenCardView, lmkVar})).booleanValue();
        }
        if (tBLiveOpenCardView == null) {
            ldf.d("LiveCardConfigHelper", "live image view is null");
            return false;
        } else if (tBLiveOpenCardView.getHeight() == 0) {
            ldf.d("LiveCardConfigHelper", "live image view height is 0");
            return false;
        } else {
            Rect rect = new Rect();
            tBLiveOpenCardView.getGlobalVisibleRect(rect);
            float height = rect.height() / tBLiveOpenCardView.getHeight();
            double b = lmkVar.b();
            if (height < 0.0f || height >= b) {
                return true;
            }
            ldf.d("LiveCardConfigHelper", "dx rootView expose ratio too few. exposeRatio = " + height + ";minPlayExposeRatio = " + b);
            return false;
        }
    }

    private Context b(Context context) {
        Context a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c17621f7", new Object[]{this, context});
        }
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof fpz) {
            a2 = ((fpz) context).a();
        } else {
            a2 = context instanceof a ? ((a) context).a() : null;
        }
        if (!(a2 instanceof Activity)) {
            return null;
        }
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean a(ljs ljsVar) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2eb5407", new Object[]{this, ljsVar})).booleanValue();
        }
        IConfigService iConfigService = (IConfigService) ljsVar.a(IConfigService.class);
        if (iConfigService == null) {
            return false;
        }
        String string = iConfigService.getString("DX3LiveEnableLevel", "LevelHighMid");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        String a2 = ldc.a();
        ldf.d("LiveCardConfigHelper", "orange live enableLevel = " + string + ";deviceLevel = " + a2);
        switch (string.hashCode()) {
            case -2067010659:
                if (string.equals("LevelAll")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1936070334:
                if (string.equals("LevelHighMid")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 347384614:
                if (string.equals("LevelHigh")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 347569340:
                if (string.equals("LevelNone")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return TextUtils.equals("h", a2);
                }
                return false;
            } else if (!TextUtils.equals("h", a2) && !TextUtils.equals("m", a2)) {
                return false;
            }
        }
        return true;
    }
}
