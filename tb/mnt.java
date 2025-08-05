package tb;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.PictureDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.v;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes7.dex */
public class mnt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final View f31144a;
    private View b;
    private View c;
    private final HashSet<Drawable> d = new HashSet<>();
    private boolean e = false;

    public mnt(View view, View view2) {
        this.f31144a = view;
        this.b = view2;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.b;
    }

    public void a(List<mns> list, List<mns> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            return;
        }
        this.d.clear();
        this.e = false;
        a(this.f31144a, this.b, list, list2);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.d.clear();
        }
    }

    private void a(View view, View view2, List<mns> list, List<mns> list2) {
        View[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf7310a", new Object[]{this, view, view2, list, list2});
        } else if (a(view, view2)) {
            if (b(view, view2)) {
                this.b = view;
                return;
            }
            Object tag = view.getTag(v.APM_VIEW_TOKEN);
            if (tag instanceof String) {
                if (v.APM_VIEW_IGNORE.equals(tag)) {
                    return;
                }
                if (v.APM_VIEW_VALID.equals(tag)) {
                    a(list, mns.b(view, view2));
                    return;
                } else if (v.APM_VIEW_INVALID.equals(tag)) {
                    a(list2, mns.b(view, view2));
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (a(viewGroup) && b(viewGroup)) {
                    a(list, mns.b(view, view2));
                    return;
                }
                for (View view3 : mnh.a(viewGroup)) {
                    if (view3 == null) {
                        return;
                    }
                    a(view3, view2, list, list2);
                }
                return;
            }
            boolean[] zArr = new boolean[1];
            if (a(view, false, this.d, zArr)) {
                a(list, mns.b(view, view2));
            }
            this.e = zArr[0];
        }
    }

    public static boolean a(View view, View view2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7536b92c", new Object[]{view, view2})).booleanValue() : mnh.a(view, view2) && view.getVisibility() == 0;
    }

    public static boolean b(View view, View view2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a7827ed", new Object[]{view, view2})).booleanValue() : Boolean.TRUE.equals(view.getTag(v.APM_PAGE_ROOT_VIEW)) && view2 != view;
    }

    public static boolean a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a1860ab", new Object[]{viewGroup})).booleanValue() : (viewGroup instanceof WebView) || mni.INSTANCE.a(viewGroup);
    }

    public static boolean b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c368452c", new Object[]{viewGroup})).booleanValue() : viewGroup instanceof WebView ? mnc.INSTANCE.c((WebView) viewGroup) == 100 : mni.INSTANCE.a(viewGroup) && mni.INSTANCE.c(viewGroup) == 100;
    }

    public static boolean a(View view, boolean z, HashSet<Drawable> hashSet, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0454e26", new Object[]{view, new Boolean(z), hashSet, zArr})).booleanValue();
        }
        if (zArr == null) {
            zArr = new boolean[1];
        }
        if (view instanceof ImageView) {
            Drawable drawable = ((ImageView) view).getDrawable();
            if (Build.VERSION.SDK_INT >= 23 && (drawable instanceof DrawableWrapper)) {
                drawable = ((DrawableWrapper) drawable).getDrawable();
            }
            if (a(drawable) && !hashSet.contains(drawable)) {
                hashSet.add(drawable);
                return true;
            }
            Drawable background = view.getBackground();
            if (Build.VERSION.SDK_INT >= 23 && !z && (background instanceof DrawableWrapper)) {
                background = ((DrawableWrapper) background).getDrawable();
            }
            if (!a(background) || hashSet.contains(background)) {
                return false;
            }
            hashSet.add(background);
            return true;
        } else if (view instanceof TextView) {
            if (!(view instanceof EditText)) {
                return (!z && (view instanceof Button)) || !TextUtils.isEmpty(((TextView) view).getText().toString());
            }
            zArr[0] = view.isFocusable();
            return true;
        } else if (!z && "com.taobao.android.dinamicx.view.DXNativeFastText".equals(view.getClass().getName())) {
            return true;
        } else {
            return z;
        }
    }

    public static boolean a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd037b90", new Object[]{drawable})).booleanValue() : (drawable instanceof BitmapDrawable) || (drawable instanceof NinePatchDrawable) || (drawable instanceof AnimationDrawable) || (drawable instanceof ShapeDrawable) || (drawable instanceof PictureDrawable);
    }

    private void a(List<mns> list, mns mnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7461c697", new Object[]{this, list, mnsVar});
        } else if (list == null) {
        } else {
            list.add(mnsVar);
        }
    }
}
