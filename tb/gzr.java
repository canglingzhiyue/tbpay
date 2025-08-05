package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailItem;

/* loaded from: classes5.dex */
public abstract class gzr extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f28561a;
    public b b;
    private ThumbnailItem c;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    static {
        kge.a(-137235518);
    }

    public gzr(View view) {
        super(view);
    }

    public void a(ThumbnailItem thumbnailItem, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79536dd", new Object[]{this, thumbnailItem, new Integer(i), new Boolean(z)});
            return;
        }
        this.c = thumbnailItem;
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: tb.gzr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (gzr.this.f28561a == null) {
                } else {
                    gzr.this.f28561a.a();
                }
            }
        });
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.gzr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                if (gzr.this.b != null) {
                    gzr.this.b.a();
                }
                return false;
            }
        });
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c.typeTag;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2984527c", new Object[]{this, aVar});
        } else {
            this.f28561a = aVar;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2984c6db", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }
}
