package tb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import com.taobao.unit.center.templatesync.ITemplateSyncService;

@AURAExtensionImpl(code = "alibuy.impl.event.bubble")
/* loaded from: classes4.dex */
public final class dtq extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f26971a;

    static {
        kge.a(1873281300);
    }

    public static /* synthetic */ Object ipc$super(dtq dtqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : ITemplateSyncService.LAYOUT_STYLE_BUBBLE;
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        Context e = b().e();
        if (!(e instanceof Activity)) {
            arc.a().a("context is not Activity Type !!");
            return;
        }
        d eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (bau.a(c)) {
            arc.a().a("eventFields is null !!");
            return;
        }
        JSONObject jSONObject = c.getJSONObject("params");
        if (bau.a(jSONObject)) {
            arc.a().a("params is null !!");
            return;
        }
        String string = jSONObject.getString("content");
        if (TextUtils.isEmpty(string)) {
            arc.a().a("content is null !!");
            return;
        }
        String string2 = jSONObject.getString("showOnceCode");
        if (!TextUtils.isEmpty(string2) && !a(e, string2)) {
            arc.a().a("needShown is false !!");
        } else {
            a((Activity) e, eventModel, string);
        }
    }

    private void a(Activity activity, d dVar, String str) {
        DXRuntimeContext dXRuntimeContext;
        View v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1fad589", new Object[]{this, activity, dVar, str});
            return;
        }
        int[] iArr = new int[2];
        Object obj = dVar.f().get(d.EXT_KEY_DX_RUNTIME_CONTEXT);
        if (!(obj instanceof DXRuntimeContext) || (v = (dXRuntimeContext = (DXRuntimeContext) obj).v()) == null) {
            return;
        }
        a(dXRuntimeContext, iArr);
        a(v, activity, str, iArr[0], iArr[1]);
    }

    private void a(DXRuntimeContext dXRuntimeContext, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb552a7", new Object[]{this, dXRuntimeContext, iArr});
            return;
        }
        DXWidgetNode d = dXRuntimeContext.d();
        int left = d.getLeft();
        int width = d.getWidth();
        int height = d.getHeight();
        iArr[0] = left - (width / 2);
        iArr[1] = duv.b(b().e()) + duv.a(b().e()) + height;
    }

    private boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        if (this.f26971a == null) {
            this.f26971a = context.getSharedPreferences("AliBuyDialogExtension", 0);
        }
        if (this.f26971a.getInt(str, 0) == 1) {
            return false;
        }
        this.f26971a.edit().putInt(str, 1).apply();
        return true;
    }

    private void a(View view, Activity activity, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd8e6", new Object[]{this, view, activity, str, new Integer(i), new Integer(i2)});
        } else if (activity.isFinishing()) {
        } else {
            final PopupWindow popupWindow = new PopupWindow();
            View inflate = LayoutInflater.from(activity).inflate(R.layout.alibuy_bubble_layout, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.content);
            textView.setText(str);
            textView.setOnClickListener(new View.OnClickListener() { // from class: tb.dtq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        popupWindow.dismiss();
                    }
                }
            });
            popupWindow.setContentView(inflate);
            popupWindow.setWidth(-2);
            popupWindow.setHeight(-2);
            popupWindow.setTouchable(true);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setBackgroundDrawable(new BitmapDrawable(activity.getResources(), (Bitmap) null));
            try {
                popupWindow.showAtLocation(view, 51, i, i2);
            } catch (Throwable th) {
                arc.a().a(th.getMessage());
            }
        }
    }
}
