package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d;
import com.taobao.android.litecreator.widgets.LCBubble;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class ThumbnailRecyclerview extends RecyclerView implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ThumbnailRecyclerview";
    private d mAdapter;
    private com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a mCallback;
    private g mLinearLayoutManager;

    static {
        kge.a(-135319522);
        kge.a(-2071828807);
    }

    public static /* synthetic */ Object ipc$super(ThumbnailRecyclerview thumbnailRecyclerview, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a access$000(ThumbnailRecyclerview thumbnailRecyclerview) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a) ipChange.ipc$dispatch("8e45f12e", new Object[]{thumbnailRecyclerview}) : thumbnailRecyclerview.mCallback;
    }

    public static /* synthetic */ void access$100(ThumbnailRecyclerview thumbnailRecyclerview, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651f09da", new Object[]{thumbnailRecyclerview, new Integer(i), view});
        } else {
            thumbnailRecyclerview.showDeleteBubble(i, view);
        }
    }

    public static /* synthetic */ d access$200(ThumbnailRecyclerview thumbnailRecyclerview) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("5f6c9149", new Object[]{thumbnailRecyclerview}) : thumbnailRecyclerview.mAdapter;
    }

    public ThumbnailRecyclerview(Context context) {
        super(context);
        init();
    }

    public ThumbnailRecyclerview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ThumbnailRecyclerview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mAdapter = new d(getContext(), new d.b() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailRecyclerview.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.b
            public void a(int i, boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
                } else if (ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this) == null) {
                } else {
                    ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).a(i, z, z2);
                }
            }

            @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.b
            public void a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                } else if (ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this) == null) {
                } else {
                    ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).a(i, i2);
                }
            }

            @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.b
            public void a(int i, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("11131157", new Object[]{this, new Integer(i), view});
                    return;
                }
                ThumbnailRecyclerview.access$100(ThumbnailRecyclerview.this, i, view);
                ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).c(i);
            }

            @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.b
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this) == null) {
                } else {
                    ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).b(i);
                }
            }

            @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).a();
                }
            }
        });
        this.mLinearLayoutManager = new g(getContext(), 0, false, null);
        this.mLinearLayoutManager.a(150.0f);
        setLayoutManager(this.mLinearLayoutManager);
        setAdapter(this.mAdapter);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String c;
        public String d;
        public boolean f;
        public boolean g;

        /* renamed from: a  reason: collision with root package name */
        public int f13348a = 9;
        public int b = 5;
        public boolean e = true;

        static {
            kge.a(1526912680);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ccea1a68", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dccb7741", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d0b43a2", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9bd1b8a9", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e4382ed1", new Object[]{this, new Integer(i)});
            }
            this.f13348a = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b3f86270", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ac8baae0", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }
    }

    private void showDeleteBubble(final int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12cb9daa", new Object[]{this, new Integer(i), view});
            return;
        }
        final LCBubble lCBubble = new LCBubble(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.lay_lc_thumbnail_delete_bubble, (ViewGroup) null, false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailRecyclerview.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                lCBubble.a();
                ThumbnailRecyclerview.access$200(ThumbnailRecyclerview.this).b(i);
                if (ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this) == null) {
                    return;
                }
                ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).a(i);
            }
        });
        LCBubble.b c = new LCBubble.b().b(false).a(false).c(true).a(Long.MAX_VALUE).b(inflate).a(view).a(0).c(0);
        lCBubble.a(new LCBubble.d() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailRecyclerview.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.widgets.LCBubble.d
            public void a(LCBubble lCBubble2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fe436e32", new Object[]{this, lCBubble2});
                }
            }

            @Override // com.taobao.android.litecreator.widgets.LCBubble.d
            public void c(LCBubble lCBubble2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("327a6b70", new Object[]{this, lCBubble2});
                }
            }

            @Override // com.taobao.android.litecreator.widgets.LCBubble.d
            public void b(LCBubble lCBubble2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("185eecd1", new Object[]{this, lCBubble2});
                } else {
                    ThumbnailRecyclerview.access$200(ThumbnailRecyclerview.this).a(false);
                }
            }
        });
        lCBubble.a(c);
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.b
    public void setItems(List<ThumbnailItem> list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e578150", new Object[]{this, list, aVar});
        } else {
            this.mAdapter.a(list, aVar);
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.b
    public void addItems(List<ThumbnailItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7485d997", new Object[]{this, list});
        } else {
            this.mAdapter.b(list);
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.b
    public List<ThumbnailItem> getItems() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this}) : this.mAdapter.e();
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.b
    public void updateCorrespondingItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b2545f", new Object[]{this, new Integer(i)});
        } else {
            this.mAdapter.h(i);
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.b
    public void notifyDataChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd821ca8", new Object[]{this});
        } else {
            this.mAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.b
    public void setSelectedIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74476c7", new Object[]{this, new Integer(i)});
        } else {
            this.mAdapter.c(i);
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.b
    public void setIThumbnailCallback(com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc024e1", new Object[]{this, aVar});
        } else {
            this.mCallback = aVar;
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.b
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mAdapter.a();
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.b
    public void removeItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb677405", new Object[]{this, new Integer(i)});
        } else {
            this.mAdapter.b(i);
        }
    }
}
