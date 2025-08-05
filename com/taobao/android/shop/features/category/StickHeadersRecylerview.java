package com.taobao.android.shop.features.category;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class StickHeadersRecylerview extends TRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    public GridLayoutManager gridLayoutManager;
    public a mAdapter;
    public List<c> mCatInfos;
    private boolean mInitFlag;
    private View mSuspendView;
    private int mSuspendViewHeight;
    private boolean mSuspendViewVisible;
    private int mSuspendViewWidth;
    public float x;
    public float y;

    public static /* synthetic */ Object ipc$super(StickHeadersRecylerview stickHeadersRecylerview, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case -133698345:
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            case 249482071:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public StickHeadersRecylerview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInitFlag = false;
    }

    public StickHeadersRecylerview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInitFlag = false;
    }

    public StickHeadersRecylerview(Context context) {
        super(context);
        this.mInitFlag = false;
    }

    static {
        kge.a(1980804762);
        kge.a(-126490565);
        TAG = StickHeadersRecylerview.class.getSimpleName();
    }

    public void setPinnedHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c248a1f", new Object[]{this, view});
            return;
        }
        this.mSuspendView = view;
        if (this.mSuspendView != null) {
            setFadingEdgeLength(0);
        }
        requestLayout();
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f807ecd7", new Object[]{this, layoutManager});
            return;
        }
        super.setLayoutManager(layoutManager);
        this.gridLayoutManager = (GridLayoutManager) layoutManager;
    }

    public void setAdapter(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adab7cd1", new Object[]{this, aVar});
            return;
        }
        super.setAdapter((RecyclerView.Adapter) aVar);
        this.mAdapter = aVar;
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        View view = this.mSuspendView;
        if (view == null) {
            return;
        }
        measureChild(view, i, i2);
        this.mSuspendViewWidth = this.mSuspendView.getMeasuredWidth();
        this.mSuspendViewHeight = this.mSuspendView.getMeasuredHeight();
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View view = this.mSuspendView;
        if (view == null) {
            return;
        }
        view.layout(0, 0, this.mSuspendViewWidth, this.mSuspendViewHeight);
        configureSuspendView(this.gridLayoutManager.findFirstVisibleItemPosition());
    }

    public void configureSuspendView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20134201", new Object[]{this, new Integer(i)});
        } else if (this.mSuspendView == null) {
        } else {
            if (!this.mInitFlag) {
                this.mInitFlag = true;
            }
            int pinnedHeaderState = getPinnedHeaderState(i);
            if (pinnedHeaderState == 0) {
                this.mSuspendViewVisible = false;
            } else if (pinnedHeaderState == 1) {
                configurePinnedHeader(this.mSuspendView, i);
                this.mSuspendView.layout(0, 0, this.mSuspendViewWidth, this.mSuspendViewHeight);
                this.mSuspendViewVisible = true;
            } else if (pinnedHeaderState != 2) {
            } else {
                int bottom = getChildAt(0).getBottom();
                int height = this.mSuspendView.getHeight();
                int i2 = bottom < height ? bottom - height : 0;
                configurePinnedHeader(this.mSuspendView, i);
                if (this.mSuspendView.getTop() != i2) {
                    this.mSuspendView.layout(0, i2, this.mSuspendViewWidth, this.mSuspendViewHeight + i2);
                }
                this.mSuspendViewVisible = true;
            }
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        if (!this.mSuspendViewVisible || (view = this.mSuspendView) == null) {
            return;
        }
        drawChild(canvas, view, getDrawingTime());
    }

    public int getPinnedHeaderState(int i) {
        List<c> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7debeb9", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i <= 0 || (list = this.mCatInfos) == null) {
            return 0;
        }
        try {
            int i2 = list.get(i).f;
            if (i2 == 0) {
                return 0;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    return 0;
                }
                if (this.mCatInfos.get(i).g) {
                    return 2;
                }
                if (!this.mCatInfos.get(i).g) {
                    if (this.mCatInfos.get(i + 2).f != 2) {
                        return 2;
                    }
                }
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void configurePinnedHeader(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e166cd03", new Object[]{this, view, new Integer(i)});
            return;
        }
        if (this.mCatInfos.get(i).f != 1) {
            if (this.mCatInfos.get(i).f == 2 || this.mCatInfos.get(i).f == 4) {
                while (true) {
                    i--;
                    if (this.mCatInfos.get(i).f == 1) {
                        break;
                    }
                }
            } else {
                i = -1;
            }
        }
        c cVar = this.mCatInfos.get(i);
        ((TextView) view.findViewById(R.id.shop_category_group_item1_title)).setText(cVar.b);
        TextView textView = (TextView) view.findViewById(R.id.shop_category_group_item1_all);
        ImageView imageView = (ImageView) view.findViewById(R.id.shop_category_group_item1_next_img);
        view.findViewById(R.id.shop_category_group_item1_divider).setVisibility(8);
        if (cVar.f == 0) {
            textView.setVisibility(8);
            imageView.setVisibility(0);
            return;
        }
        textView.setVisibility(0);
        imageView.setVisibility(8);
    }

    public void notifyDataChanged(List<c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8325999", new Object[]{this, list});
        } else {
            this.mCatInfos = list;
        }
    }
}
