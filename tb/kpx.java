package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class kpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(250350473);
    }

    public static BitmapDrawable a(ViewGroup viewGroup) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("86d68ac4", new Object[]{viewGroup});
        }
        TextureView b = b(viewGroup);
        if (b != null && (bitmap = b.getBitmap()) != null && bitmap.getByteCount() > 0) {
            return new BitmapDrawable(b.getContext().getResources(), bitmap);
        }
        return null;
    }

    private static TextureView b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("f1e98227", new Object[]{viewGroup});
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt);
            }
        }
        return null;
    }
}
