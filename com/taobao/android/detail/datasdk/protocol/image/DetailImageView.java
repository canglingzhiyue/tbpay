package com.taobao.android.detail.datasdk.protocol.image;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epl;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailImageView extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private epl option;
    private String url;

    static {
        kge.a(-1340712594);
    }

    public static /* synthetic */ Object ipc$super(DetailImageView detailImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1142475969) {
            if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode != 1626033557) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onAttachedToWindow();
                return null;
            }
        }
        return super.getDrawable();
    }

    public DetailImageView(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.datasdk.protocol.image.DetailImageView");
    }

    public DetailImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        emu.a("com.taobao.android.detail.datasdk.protocol.image.DetailImageView");
    }

    public DetailImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        emu.a("com.taobao.android.detail.datasdk.protocol.image.DetailImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        recoverImage();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        releaseImage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r0.getBitmap().isRecycled() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void recoverImage() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.datasdk.protocol.image.DetailImageView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r2 = "fff3cb5e"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            java.lang.String r1 = r4.url
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4d
            tb.epl r1 = r4.option
            if (r1 != 0) goto L23
            goto L4d
        L23:
            if (r0 == 0) goto L3d
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L3c
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r1 = r0.getBitmap()
            if (r1 == 0) goto L3c
            android.graphics.Bitmap r0 = r0.getBitmap()
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto L3c
            goto L3d
        L3c:
            r3 = 0
        L3d:
            if (r3 == 0) goto L4d
            com.taobao.android.detail.datasdk.protocol.adapter.core.c r0 = tb.epj.b()
            if (r0 == 0) goto L4d
            java.lang.String r1 = r4.url
            tb.epl r2 = r4.option
            r3 = 0
            r0.a(r1, r4, r2, r3)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.datasdk.protocol.image.DetailImageView.recoverImage():void");
    }

    private void releaseImage() {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad6181b", new Object[]{this});
        } else if (TextUtils.isEmpty(this.url) || this.option == null || (drawable = super.getDrawable()) == null) {
        } else {
            if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() != null) {
                setImageDrawable(null);
            }
            setImageDrawable(null);
        }
    }

    public void setImageDrawable(String str, BitmapDrawable bitmapDrawable, epl eplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c701acc", new Object[]{this, str, bitmapDrawable, eplVar});
        } else if (bitmapDrawable == null || bitmapDrawable.getBitmap() == null || bitmapDrawable.getBitmap().isRecycled()) {
            if (eplVar == null || eplVar.c() == null) {
                return;
            }
            setScaleType(eplVar.c());
        } else {
            setImageDrawable(bitmapDrawable);
            if (eplVar != null && eplVar.b() != null) {
                setScaleType(eplVar.b());
            }
            this.url = str;
            this.option = eplVar;
        }
    }
}
