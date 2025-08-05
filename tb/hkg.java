package tb;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.view.a;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.q;
import tb.phj;

/* loaded from: classes6.dex */
public class hkg extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBLiveDataModel c;
    private FrameLayout d;

    static {
        kge.a(1272426103);
    }

    public static /* synthetic */ Object ipc$super(hkg hkgVar, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ TBLiveDataModel a(hkg hkgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("3a8a1a7b", new Object[]{hkgVar}) : hkgVar.c;
    }

    public static /* synthetic */ FrameLayout b(hkg hkgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("339128a4", new Object[]{hkgVar}) : hkgVar.d;
    }

    public hkg(Context context, TBLiveDataModel tBLiveDataModel, boolean z) {
        super(context, cgl.h().a(), z);
        this.c = tBLiveDataModel;
        try {
            getWindow().setWindowAnimations(R.style.TL_Topbar_FavoriteGuideDialog_Anim_flexalocal);
        } catch (Throwable th) {
            q.b("FavoriteGuideDialog", "FavoriteGuideDialog e: " + th.getMessage());
        }
        getWindow().setDimAmount(0.0f);
    }

    @Override // com.taobao.taolive.room.ui.view.a
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : LayoutInflater.from(this.f21750a).inflate(R.layout.taolive_topbar_favorete_guide_layout_flexalocal, (ViewGroup) null);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.d = (FrameLayout) findViewById(R.id.dialog_container);
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            phg.g().a(this.f21750a, "taobaolive_room_favorite_guide", new phj.a() { // from class: tb.hkg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.phj.a
                public void onCreateView(DXRootView dXRootView) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                    } else if (dXRootView == null || hkg.a(hkg.this) == null) {
                    } else {
                        hkg.b(hkg.this).addView(dXRootView);
                        phg.g().a(dXRootView, (JSONObject) pqj.b(hkg.a(hkg.this).mVideoInfo));
                    }
                }
            });
        }
    }

    @Override // com.taobao.taolive.room.ui.view.a
    public WindowManager.LayoutParams a(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("9ad0565b", new Object[]{this, displayMetrics});
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (this.b) {
            attributes.gravity = 85;
            attributes.width = displayMetrics.heightPixels;
            attributes.height = -2;
        } else {
            attributes.gravity = 83;
            attributes.width = displayMetrics.widthPixels;
        }
        return attributes;
    }
}
