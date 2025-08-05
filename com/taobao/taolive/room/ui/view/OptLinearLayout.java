package com.taobao.taolive.room.ui.view;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class OptLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DecorAdapter mAdapter;
    private DataSetObserver mDataSetObserver;
    private int mItemCount;
    private View.OnClickListener mOnClickListener;
    private a onItemClickListener;

    /* loaded from: classes8.dex */
    public interface a {
        void a(View view, int i);
    }

    static {
        kge.a(1464141939);
    }

    public static /* synthetic */ Object ipc$super(OptLinearLayout optLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000(OptLinearLayout optLinearLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("52cb75ca", new Object[]{optLinearLayout})).intValue() : optLinearLayout.mItemCount;
    }

    public static /* synthetic */ int access$002(OptLinearLayout optLinearLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("594c6281", new Object[]{optLinearLayout, new Integer(i)})).intValue();
        }
        optLinearLayout.mItemCount = i;
        return i;
    }

    public static /* synthetic */ DecorAdapter access$100(OptLinearLayout optLinearLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecorAdapter) ipChange.ipc$dispatch("54071394", new Object[]{optLinearLayout}) : optLinearLayout.mAdapter;
    }

    public static /* synthetic */ View.OnClickListener access$200(OptLinearLayout optLinearLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("edba9be", new Object[]{optLinearLayout}) : optLinearLayout.mOnClickListener;
    }

    public static /* synthetic */ a access$300(OptLinearLayout optLinearLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7c411b5", new Object[]{optLinearLayout}) : optLinearLayout.onItemClickListener;
    }

    public OptLinearLayout(Context context) {
        super(context);
        this.mDataSetObserver = new DataSetObserver() { // from class: com.taobao.taolive.room.ui.view.OptLinearLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1172900388) {
                    super.onChanged();
                    return null;
                } else if (hashCode != 1641176753) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onInvalidated();
                    return null;
                }
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                    return;
                }
                super.onChanged();
                OptLinearLayout optLinearLayout = OptLinearLayout.this;
                OptLinearLayout.access$002(optLinearLayout, OptLinearLayout.access$100(optLinearLayout).getCount());
                if (OptLinearLayout.access$000(OptLinearLayout.this) == 0 || OptLinearLayout.access$100(OptLinearLayout.this).isEmpty()) {
                    OptLinearLayout.this.setVisibility(8);
                    return;
                }
                OptLinearLayout.this.setVisibility(0);
                int childCount = OptLinearLayout.this.getChildCount();
                for (int access$000 = OptLinearLayout.access$000(OptLinearLayout.this); access$000 < childCount; access$000++) {
                    OptLinearLayout.this.getChildAt(access$000).setVisibility(8);
                }
                for (int i = 0; i < OptLinearLayout.access$000(OptLinearLayout.this); i++) {
                    View childAt = OptLinearLayout.this.getChildAt(i);
                    if (childAt == null) {
                        childAt = OptLinearLayout.access$100(OptLinearLayout.this).getView(i, null, OptLinearLayout.this);
                        OptLinearLayout.this.addView(childAt);
                    } else {
                        childAt.setVisibility(0);
                        OptLinearLayout.access$100(OptLinearLayout.this).getView(i, childAt, OptLinearLayout.this);
                    }
                    childAt.setTag(Integer.valueOf(i));
                    childAt.setOnClickListener(OptLinearLayout.access$200(OptLinearLayout.this));
                }
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
                } else {
                    super.onInvalidated();
                }
            }
        };
        this.mOnClickListener = new View.OnClickListener() { // from class: com.taobao.taolive.room.ui.view.OptLinearLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (OptLinearLayout.access$300(OptLinearLayout.this) == null) {
                } else {
                    OptLinearLayout.access$300(OptLinearLayout.this).a(view, ((Integer) view.getTag()).intValue());
                }
            }
        };
    }

    public OptLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDataSetObserver = new DataSetObserver() { // from class: com.taobao.taolive.room.ui.view.OptLinearLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1172900388) {
                    super.onChanged();
                    return null;
                } else if (hashCode != 1641176753) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onInvalidated();
                    return null;
                }
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                    return;
                }
                super.onChanged();
                OptLinearLayout optLinearLayout = OptLinearLayout.this;
                OptLinearLayout.access$002(optLinearLayout, OptLinearLayout.access$100(optLinearLayout).getCount());
                if (OptLinearLayout.access$000(OptLinearLayout.this) == 0 || OptLinearLayout.access$100(OptLinearLayout.this).isEmpty()) {
                    OptLinearLayout.this.setVisibility(8);
                    return;
                }
                OptLinearLayout.this.setVisibility(0);
                int childCount = OptLinearLayout.this.getChildCount();
                for (int access$000 = OptLinearLayout.access$000(OptLinearLayout.this); access$000 < childCount; access$000++) {
                    OptLinearLayout.this.getChildAt(access$000).setVisibility(8);
                }
                for (int i = 0; i < OptLinearLayout.access$000(OptLinearLayout.this); i++) {
                    View childAt = OptLinearLayout.this.getChildAt(i);
                    if (childAt == null) {
                        childAt = OptLinearLayout.access$100(OptLinearLayout.this).getView(i, null, OptLinearLayout.this);
                        OptLinearLayout.this.addView(childAt);
                    } else {
                        childAt.setVisibility(0);
                        OptLinearLayout.access$100(OptLinearLayout.this).getView(i, childAt, OptLinearLayout.this);
                    }
                    childAt.setTag(Integer.valueOf(i));
                    childAt.setOnClickListener(OptLinearLayout.access$200(OptLinearLayout.this));
                }
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
                } else {
                    super.onInvalidated();
                }
            }
        };
        this.mOnClickListener = new View.OnClickListener() { // from class: com.taobao.taolive.room.ui.view.OptLinearLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (OptLinearLayout.access$300(OptLinearLayout.this) == null) {
                } else {
                    OptLinearLayout.access$300(OptLinearLayout.this).a(view, ((Integer) view.getTag()).intValue());
                }
            }
        };
    }

    public OptLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDataSetObserver = new DataSetObserver() { // from class: com.taobao.taolive.room.ui.view.OptLinearLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1172900388) {
                    super.onChanged();
                    return null;
                } else if (hashCode != 1641176753) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onInvalidated();
                    return null;
                }
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                    return;
                }
                super.onChanged();
                OptLinearLayout optLinearLayout = OptLinearLayout.this;
                OptLinearLayout.access$002(optLinearLayout, OptLinearLayout.access$100(optLinearLayout).getCount());
                if (OptLinearLayout.access$000(OptLinearLayout.this) == 0 || OptLinearLayout.access$100(OptLinearLayout.this).isEmpty()) {
                    OptLinearLayout.this.setVisibility(8);
                    return;
                }
                OptLinearLayout.this.setVisibility(0);
                int childCount = OptLinearLayout.this.getChildCount();
                for (int access$000 = OptLinearLayout.access$000(OptLinearLayout.this); access$000 < childCount; access$000++) {
                    OptLinearLayout.this.getChildAt(access$000).setVisibility(8);
                }
                for (int i2 = 0; i2 < OptLinearLayout.access$000(OptLinearLayout.this); i2++) {
                    View childAt = OptLinearLayout.this.getChildAt(i2);
                    if (childAt == null) {
                        childAt = OptLinearLayout.access$100(OptLinearLayout.this).getView(i2, null, OptLinearLayout.this);
                        OptLinearLayout.this.addView(childAt);
                    } else {
                        childAt.setVisibility(0);
                        OptLinearLayout.access$100(OptLinearLayout.this).getView(i2, childAt, OptLinearLayout.this);
                    }
                    childAt.setTag(Integer.valueOf(i2));
                    childAt.setOnClickListener(OptLinearLayout.access$200(OptLinearLayout.this));
                }
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
                } else {
                    super.onInvalidated();
                }
            }
        };
        this.mOnClickListener = new View.OnClickListener() { // from class: com.taobao.taolive.room.ui.view.OptLinearLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (OptLinearLayout.access$300(OptLinearLayout.this) == null) {
                } else {
                    OptLinearLayout.access$300(OptLinearLayout.this).a(view, ((Integer) view.getTag()).intValue());
                }
            }
        };
    }

    public void setAdapter(DecorAdapter decorAdapter) {
        DataSetObserver dataSetObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa806348", new Object[]{this, decorAdapter});
        } else if (decorAdapter == null) {
        } else {
            DecorAdapter decorAdapter2 = this.mAdapter;
            if (decorAdapter2 != null && (dataSetObserver = this.mDataSetObserver) != null) {
                decorAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
            this.mAdapter = decorAdapter;
            this.mAdapter.registerDataSetObserver(this.mDataSetObserver);
            this.mAdapter.notifyDataSetChanged();
        }
    }

    public Adapter getAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Adapter) ipChange.ipc$dispatch("f752eae1", new Object[]{this}) : this.mAdapter;
    }

    public void setOnItemClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d863602", new Object[]{this, aVar});
        } else {
            this.onItemClickListener = aVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        DecorAdapter decorAdapter = this.mAdapter;
        if (decorAdapter == null) {
            return;
        }
        try {
            decorAdapter.unregisterDataSetObserver(this.mDataSetObserver);
        } catch (Exception unused) {
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class ListAdapter<T> extends DecorAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Context context;
        public List<T> mData;
        public LayoutInflater mInflater;
        public boolean mIsChangeFlag;

        static {
            kge.a(457185792);
        }

        public ListAdapter(Context context) {
            this.mData = new ArrayList();
            this.context = context;
            this.mInflater = LayoutInflater.from(context);
        }

        public ListAdapter(List<T> list, Context context) {
            this.mData = new ArrayList();
            this.mData = list;
            this.context = context;
            this.mInflater = LayoutInflater.from(context);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.mData.size();
        }

        @Override // android.widget.Adapter
        public T getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : this.mData.get(i);
        }

        public void update(List<T> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28dd1dc1", new Object[]{this, list});
            } else if (list == null) {
            } else {
                this.mData = list;
                notifyDataSetChanged();
                this.mIsChangeFlag = true;
            }
        }

        public void remove(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
                return;
            }
            this.mData.remove(i);
            notifyDataSetChanged();
        }

        public List<T> getData() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this}) : this.mData;
        }

        public LayoutInflater getLayoutInflater() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LayoutInflater) ipChange.ipc$dispatch("bd31d6e4", new Object[]{this}) : this.mInflater;
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class DecorAdapter implements Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final DataSetObservable mDataSetObservable = new DataSetObservable();

        static {
            kge.a(1017052891);
            kge.a(-589033980);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("35312b0e", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63701d27", new Object[]{this, dataSetObserver});
            } else {
                this.mDataSetObservable.registerObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66db852e", new Object[]{this, dataSetObserver});
            } else {
                this.mDataSetObservable.unregisterObserver(dataSetObserver);
            }
        }

        public void notifyDataSetChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            } else {
                this.mDataSetObservable.notifyChanged();
            }
        }
    }
}
