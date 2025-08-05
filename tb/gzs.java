package tb;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailItem;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.f;
import com.taobao.android.litecreator.util.bg;
import com.taobao.android.litecreator.widgets.SqTUrlImageView;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class gzs extends gzr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int g;
    private static final int h;
    public Bitmap c;
    public ImageView d;
    public SqTUrlImageView e;
    public FrameLayout f;
    private final f i;
    public SqTUrlImageView j;
    public ImageView k;
    private boolean l;
    private boolean m;
    private ImageView n;

    public static /* synthetic */ Object ipc$super(gzs gzsVar, String str, Object... objArr) {
        if (str.hashCode() == -1214957859) {
            super.a((ThumbnailItem) objArr[0], ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1189941845);
        g = com.taobao.android.litecreator.util.f.a(28.8f);
        h = com.taobao.android.litecreator.util.f.a(34.56f);
    }

    public gzs(View view, boolean z, boolean z2) {
        super(view);
        this.l = z;
        this.m = z2;
        this.e = (SqTUrlImageView) view.findViewById(R.id.select_mask);
        this.j = (SqTUrlImageView) view.findViewById(R.id.select_mask_layer);
        this.d = (ImageView) view.findViewById(R.id.iv_thumbnail);
        this.f = (FrameLayout) view.findViewById(R.id.iv_thumbnail_container);
        this.k = (ImageView) view.findViewById(R.id.video_play_icon);
        this.n = (ImageView) view.findViewById(R.id.ivWarn);
        int i = h;
        int i2 = g;
        this.i = new f(i, i2, i, i2, 250);
        this.i.a(new AccelerateDecelerateInterpolator());
    }

    public void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        } else {
            this.c = bitmap;
        }
    }

    @Override // tb.gzr
    public void a(ThumbnailItem thumbnailItem, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79536dd", new Object[]{this, thumbnailItem, new Integer(i), new Boolean(z)});
            return;
        }
        super.a(thumbnailItem, i, z);
        this.e.setBackgroundResource(R.drawable.drawable_thumbnail_item_selected_bg);
        this.j.setBackgroundResource(R.drawable.drawable_thumbnail_item_selected_mask_layer);
        boolean z2 = thumbnailItem.coverThumbnail == null;
        Bitmap bitmap = z2 ? this.c : thumbnailItem.coverThumbnail;
        this.d.setOutlineProvider(new ViewOutlineProvider() { // from class: tb.gzs.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                } else {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gzs.this.d.getContext().getResources().getDimensionPixelSize(R.dimen.lc_thumbnail_item_radius));
                }
            }
        });
        this.d.setClipToOutline(true);
        this.d.setImageBitmap(bitmap);
        if (this.m) {
            this.j.setVisibility(z ? 0 : 8);
        }
        this.e.setVisibility(z ? 0 : 8);
        if (z2 && thumbnailItem.imageLoader != null) {
            thumbnailItem.imageLoader.a(this.d);
        }
        this.k.setVisibility(d.TYPE_TAG_MEDIA_VIDEO.equals(b()) ? 0 : 8);
        if (this.l) {
            if (!this.i.a()) {
                this.i.c();
            }
            this.i.a(this.f, z);
        }
        if (thumbnailItem.isNeedCrop) {
            this.n.setVisibility(0);
            this.n.setAlpha(0.8f);
            this.n.setBackground(bg.Companion.a(com.taobao.android.litecreator.util.f.a(4.0f), Color.parseColor("#80FF6200")));
            return;
        }
        this.n.setVisibility(8);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.i.b();
        }
    }
}
