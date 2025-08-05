package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taobao.R;
import java.util.List;
import tb.hin;
import tb.kge;

/* loaded from: classes6.dex */
public class TaoLiveSearchHistoryView extends LinearLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private a mDataClearListener;
    private ImageView mDeleteAllHistoryBtn;
    private TBLiveAutoTagLayout mHistoryWords;
    private f mSearchHistoryRecord;
    private b mSearchHistoryTagClickListener;

    /* loaded from: classes6.dex */
    public interface a {
        void e();
    }

    /* loaded from: classes6.dex */
    public interface b {
        void onSearchHistoryTagClicked(SearchHistory searchHistory);
    }

    static {
        kge.a(1163067046);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveSearchHistoryView taoLiveSearchHistoryView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ b access$000(TaoLiveSearchHistoryView taoLiveSearchHistoryView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("29499411", new Object[]{taoLiveSearchHistoryView}) : taoLiveSearchHistoryView.mSearchHistoryTagClickListener;
    }

    public TaoLiveSearchHistoryView(Context context) {
        super(context);
        init(context);
    }

    public TaoLiveSearchHistoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TaoLiveSearchHistoryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() != R.id.taolive_good_history_clear_btn) {
        } else {
            reset();
            hide();
            a aVar = this.mDataClearListener;
            if (aVar == null) {
                return;
            }
            aVar.e();
        }
    }

    private TextView getNewTextView(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("c12a44a8", new Object[]{this, cVar, str});
        }
        TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_search_tag_layout_flexalocal, (ViewGroup) null);
        textView.setMaxWidth(hin.a() - hin.a(this.mContext, 36.0f));
        textView.setText(str);
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(cVar)) {
            textView.setTextColor(-11509638);
            textView.setBackgroundResource(R.drawable.taolive_good_search_input_bg2_flexalocal);
        }
        return textView;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        LayoutInflater.from(this.mContext).inflate(R.layout.taolive_goods_search_history_layout_flexalocal, this);
        this.mHistoryWords = (TBLiveAutoTagLayout) findViewById(R.id.taolive_good_history_words);
        this.mDeleteAllHistoryBtn = (ImageView) findViewById(R.id.taolive_good_history_clear_btn);
        this.mDeleteAllHistoryBtn.setOnClickListener(this);
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.mHistoryWords.removeAllViews();
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            setVisibility(8);
        }
    }

    public void setDataClearListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7254a2", new Object[]{this, aVar});
        } else {
            this.mDataClearListener = aVar;
        }
    }

    public void setHistoryKeyWords(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7989bf0f", new Object[]{this, fVar});
        } else if (fVar == null) {
        } else {
            this.mSearchHistoryRecord = fVar;
        }
    }

    public void setSearchTagClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4cf48a", new Object[]{this, bVar});
        } else {
            this.mSearchHistoryTagClickListener = bVar;
        }
    }

    public boolean updateView(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe566080", new Object[]{this, cVar})).booleanValue();
        }
        List<SearchHistory> a2 = this.mSearchHistoryRecord.a();
        if (a2 == null || a2.isEmpty()) {
            return true;
        }
        if (getVisibility() == 0) {
            return false;
        }
        reset();
        for (int i = 0; i < a2.size(); i++) {
            if (a2.get(i) != null) {
                final SearchHistory searchHistory = a2.get(i);
                TextView newTextView = getNewTextView(cVar, searchHistory.getKey());
                this.mHistoryWords.addView(newTextView);
                newTextView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.TaoLiveSearchHistoryView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (TaoLiveSearchHistoryView.access$000(TaoLiveSearchHistoryView.this) == null || !(view instanceof TextView)) {
                        } else {
                            TaoLiveSearchHistoryView.access$000(TaoLiveSearchHistoryView.this).onSearchHistoryTagClicked(searchHistory);
                        }
                    }
                });
            }
        }
        return false;
    }
}
