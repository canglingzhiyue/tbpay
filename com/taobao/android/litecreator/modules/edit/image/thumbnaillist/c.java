package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.y;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.android.mediapick.media.LocalMedia;
import com.taobao.tao.Globals;
import tb.hsm;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f13349a;
    private ThumbnailItem b;
    private String c;
    private long d;
    private ImageView e;

    static {
        kge.a(-792573612);
    }

    private boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue() : j <= 0;
    }

    public static /* synthetic */ ImageView a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("df28d348", new Object[]{cVar}) : cVar.e;
    }

    public c(ThumbnailItem thumbnailItem, String str, long j, int i) {
        this.b = thumbnailItem;
        this.c = str;
        this.d = j;
        this.f13349a = i;
    }

    private void a(final ThumbnailItem thumbnailItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2880e876", new Object[]{this, thumbnailItem, str});
            return;
        }
        y yVar = new y(Globals.getApplication());
        ImageMedia imageMedia = new ImageMedia();
        imageMedia.path = str;
        yVar.a((LocalMedia) imageMedia, new hsm.a() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hsm.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // tb.hsm.a
            public void a(Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
                    return;
                }
                if (c.a(c.this) != null) {
                    c.a(c.this).setImageBitmap(bitmap);
                }
                thumbnailItem.coverThumbnail = bitmap;
            }
        }, false);
    }

    public Bitmap a(ThumbnailItem thumbnailItem, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d46621ec", new Object[]{this, thumbnailItem, str, new Long(j)});
        }
        if (a(j)) {
            a(thumbnailItem, str);
            return null;
        }
        return com.taobao.android.litecreator.util.c.a(false, j, this.f13349a, true);
    }

    public void a(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f7c622", new Object[]{this, imageView});
            return;
        }
        this.e = imageView;
        Bitmap a2 = a(this.b, this.c, this.d);
        if (a2 == null) {
            return;
        }
        imageView.setImageBitmap(a2);
    }
}
