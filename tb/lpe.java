package tb;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class lpe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static lpe f30793a;
    private boolean b;
    private WeakReference<ViewGroup> c;

    static {
        kge.a(-519914193);
    }

    public static lpe a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpe) ipChange.ipc$dispatch("f076ddd", new Object[0]);
        }
        if (f30793a == null) {
            f30793a = new lpe();
        }
        return f30793a;
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else if (this.b) {
        } else {
            this.c = new WeakReference<>(viewGroup);
        }
    }

    public void a(Resource resource, Context context) {
        Resource.a animation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1c6bf5", new Object[]{this, resource, context});
        } else if (resource == null || context == null || (animation = resource.getAnimation()) == null || this.b) {
        } else {
            this.b = PreferenceManager.getDefaultSharedPreferences(context).getBoolean("hasPlayedStoreFlower", false);
            if (this.b) {
                return;
            }
            String a2 = animation.a();
            String b = animation.b();
            if (!"flowers".equals(a2)) {
                return;
            }
            a(context, b);
        }
    }

    private void a(Context context, String str) {
        WeakReference<ViewGroup> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (TextUtils.isEmpty(str) || (weakReference = this.c) == null) {
        } else {
            ViewGroup viewGroup = weakReference.get();
            if (context == null) {
                return;
            }
            try {
                TUrlImageView tUrlImageView = new TUrlImageView(context);
                viewGroup.addView(tUrlImageView, new ViewGroup.LayoutParams(-1, -1));
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_START);
                tUrlImageView.succListener(new lpf(this, tUrlImageView, context));
                tUrlImageView.failListener(new mvj(this));
                tUrlImageView.setImageUrl(str);
            } catch (Exception e) {
                i.a("ShopTreasureFlowerHelper", "showFlowers falid=" + e.getMessage());
            }
        }
    }
}
