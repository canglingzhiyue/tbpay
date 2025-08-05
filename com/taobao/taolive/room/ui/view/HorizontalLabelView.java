package com.taobao.taolive.room.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.view.OptLinearLayout;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.phg;

/* loaded from: classes8.dex */
public class HorizontalLabelView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Adapter mAdapter;
    private List<Label> mLabels;
    private a mOnLabelSelectedListener;
    private OptLinearLayout mOptLinearLayout;

    /* loaded from: classes8.dex */
    public static class Label implements Serializable {
        public boolean isSelected;
        public String text;

        static {
            kge.a(772334486);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes8.dex */
    public interface a {
    }

    static {
        kge.a(-301587738);
    }

    public static /* synthetic */ Object ipc$super(HorizontalLabelView horizontalLabelView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ List access$000(HorizontalLabelView horizontalLabelView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2fe2b843", new Object[]{horizontalLabelView}) : horizontalLabelView.mLabels;
    }

    public static /* synthetic */ Adapter access$100(HorizontalLabelView horizontalLabelView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Adapter) ipChange.ipc$dispatch("33b7c043", new Object[]{horizontalLabelView}) : horizontalLabelView.mAdapter;
    }

    public static /* synthetic */ a access$200(HorizontalLabelView horizontalLabelView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("41335cb0", new Object[]{horizontalLabelView}) : horizontalLabelView.mOnLabelSelectedListener;
    }

    public HorizontalLabelView(Context context) {
        super(context);
        init();
    }

    public HorizontalLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public HorizontalLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.taolive_horizontal_label_view, this);
        this.mOptLinearLayout = (OptLinearLayout) findViewById(R.id.label_container);
        this.mOptLinearLayout.setOnItemClickListener(new OptLinearLayout.a() { // from class: com.taobao.taolive.room.ui.view.HorizontalLabelView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.ui.view.OptLinearLayout.a
            public void a(View view, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
                    return;
                }
                int i2 = 0;
                while (i2 < HorizontalLabelView.access$000(HorizontalLabelView.this).size()) {
                    ((Label) HorizontalLabelView.access$000(HorizontalLabelView.this).get(i2)).isSelected = i2 == i;
                    i2++;
                }
                HorizontalLabelView.access$100(HorizontalLabelView.this).notifyDataSetChanged();
                if (HorizontalLabelView.access$200(HorizontalLabelView.this) == null) {
                    return;
                }
                HorizontalLabelView.access$200(HorizontalLabelView.this);
                HorizontalLabelView.access$000(HorizontalLabelView.this).get(i);
            }
        });
        this.mAdapter = new Adapter(getContext());
        this.mOptLinearLayout.setAdapter(this.mAdapter);
    }

    public void setData(List<Label> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
            return;
        }
        this.mLabels = list;
        this.mAdapter.update(list);
    }

    public void setOnLabelSelectedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff5b035", new Object[]{this, aVar});
        } else {
            this.mOnLabelSelectedListener = aVar;
        }
    }

    /* loaded from: classes8.dex */
    public static class Adapter extends OptLinearLayout.ListAdapter<Label> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1903204495);
        }

        public Adapter(Context context) {
            super(context);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            Label item = getItem(i);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("poi", String.valueOf(i));
            hashMap.put("word", item.text);
            if (view == null) {
                view = getLayoutInflater().inflate(R.layout.taolive_label_item_view, viewGroup, false);
                phg.a().a("Show-chooseCom_EXP", hashMap);
            } else {
                if (this.mIsChangeFlag) {
                    phg.a().a("Show-chooseCom_EXP", hashMap);
                }
                if (i == getCount() - 1) {
                    this.mIsChangeFlag = false;
                }
            }
            TextView textView = (TextView) view.findViewById(R.id.label_item);
            textView.setText(item.text);
            textView.setSelected(item.isSelected);
            return view;
        }
    }
}
