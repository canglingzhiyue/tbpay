package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailItem;

/* loaded from: classes5.dex */
public class gzt extends gzr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1703261916);
    }

    public static /* synthetic */ Object ipc$super(gzt gztVar, String str, Object... objArr) {
        if (str.hashCode() == -1214957859) {
            super.a((ThumbnailItem) objArr[0], ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public gzt(View view) {
        super(view);
    }

    @Override // tb.gzr
    public void a(ThumbnailItem thumbnailItem, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79536dd", new Object[]{this, thumbnailItem, new Integer(i), new Boolean(z)});
            return;
        }
        super.a(thumbnailItem, i, z);
        this.itemView.setClickable(false);
        this.itemView.setLongClickable(false);
        this.itemView.setBackgroundColor(0);
    }
}
