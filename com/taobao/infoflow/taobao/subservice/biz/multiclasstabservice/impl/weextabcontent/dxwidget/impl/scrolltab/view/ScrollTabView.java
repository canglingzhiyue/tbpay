package com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.gbg;
import tb.kge;
import tb.ldf;
import tb.ljh;
import tb.llj;
import tb.loi;
import tb.lok;
import tb.low;
import tb.lox;
import tb.loy;

/* loaded from: classes7.dex */
public class ScrollTabView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HScrollTabView";
    private boolean isScrolled;
    private final Context mContext;
    private int mCurrentTab;
    private final low mDataParse;
    private a mOnTabClickedListener;
    private List<loy> mTabItems;
    private final LinearLayout mTabsContainer;
    private final List<View> mWaitToExpViews;

    /* loaded from: classes7.dex */
    public interface a {
        void a(int i, llj lljVar);
    }

    static {
        kge.a(-2127930984);
    }

    public static /* synthetic */ Object ipc$super(ScrollTabView scrollTabView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode != 1774009266) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.performClick());
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public static /* synthetic */ void access$000(ScrollTabView scrollTabView, String str, View view, List list, lox loxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bd9be2", new Object[]{scrollTabView, str, view, list, loxVar});
        } else {
            scrollTabView.dealClick(str, view, list, loxVar);
        }
    }

    public ScrollTabView(Context context) {
        this(context, null);
    }

    public ScrollTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentTab = 0;
        this.mWaitToExpViews = new ArrayList();
        this.mTabItems = new ArrayList();
        this.isScrolled = false;
        this.mContext = context;
        this.mDataParse = new low();
        initViewAttributes();
        this.mTabsContainer = new LinearLayout(context);
        addView(this.mTabsContainer);
    }

    @Override // android.view.View
    public boolean performClick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69bd3bb2", new Object[]{this})).booleanValue() : super.performClick();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.ScrollTabView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            r1[r4] = r10
            java.lang.String r10 = "a9b14c3a"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L1c:
            int r0 = r10.getAction()
            if (r0 == 0) goto L43
            if (r0 == r4) goto L2d
            if (r0 == r3) goto L2a
            r1 = 3
            if (r0 == r1) goto L2d
            goto L46
        L2a:
            r9.isScrolled = r4
            goto L46
        L2d:
            boolean r0 = r9.isScrolled
            if (r0 == 0) goto L46
            r9.isScrolled = r2
            r4 = 2101(0x835, float:2.944E-42)
            java.lang.String r3 = "Page_Home"
            java.lang.String r5 = "Page_Home_Slice_fenlei"
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            tb.ldl.a(r3, r4, r5, r6, r7, r8)
            goto L46
        L43:
            r9.performClick()
        L46:
            boolean r10 = super.onTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.ScrollTabView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnTabClickedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97c529e", new Object[]{this, aVar});
        } else {
            this.mOnTabClickedListener = aVar;
        }
    }

    public void uiRefresh(JSONObject jSONObject, lox loxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a0afd", new Object[]{this, jSONObject, loxVar});
            return;
        }
        this.mTabItems = this.mDataParse.b(jSONObject);
        String a2 = this.mDataParse.a(jSONObject);
        if (this.mTabItems != null && a2 != null) {
            resetAll();
            addAllTabItemView(loxVar, a2, this.mTabItems);
            updateTabStyles(loxVar);
            return;
        }
        ldf.d(TAG, "mTabItems or jsUrl is null. jsUrl : " + a2);
    }

    public void reset(lox loxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b303751", new Object[]{this, loxVar});
        } else if (this.mCurrentTab == 0) {
        } else {
            this.mCurrentTab = 0;
            scrollToCurrentTab();
            updateTabStyles(loxVar);
        }
    }

    private void updateTabStyles(lox loxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17412d90", new Object[]{this, loxVar});
            return;
        }
        List<loy> list = this.mTabItems;
        int size = list == null ? 0 : list.size();
        int i = 0;
        while (i < size) {
            initTabColor((TextView) this.mTabsContainer.getChildAt(i), i == this.mCurrentTab, loxVar);
            i++;
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (isInEditMode() || this.mTabItems.size() <= 1) {
            return;
        }
        getHitRect(new Rect());
        exposureShownTab();
    }

    private void initViewAttributes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb8a993", new Object[]{this});
            return;
        }
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        setOverScrollMode(2);
    }

    private void resetAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a623f959", new Object[]{this});
            return;
        }
        this.mCurrentTab = 0;
        this.mTabsContainer.removeAllViews();
    }

    private void scrollToCurrentTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98373a2b", new Object[]{this});
            return;
        }
        int left = this.mTabsContainer.getChildAt(this.mCurrentTab).getLeft();
        if (this.mCurrentTab > 0) {
            Rect rect = new Rect();
            left = (left - ((getWidth() / 2) - getPaddingLeft())) + ((rect.right - rect.left) / 2);
        }
        scrollTo(left, 0);
    }

    private void addAllTabItemView(lox loxVar, String str, List<loy> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5663c1aa", new Object[]{this, loxVar, str, list});
            return;
        }
        this.mWaitToExpViews.clear();
        for (int i = 0; i < list.size(); i++) {
            TextView createTextView = createTextView(loxVar);
            addTab(str, i, createTextView, list, loxVar);
            this.mWaitToExpViews.add(createTextView);
        }
    }

    private TextView createTextView(lox loxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("c3028a84", new Object[]{this, loxVar});
        }
        TextView textView = new TextView(this.mContext);
        textView.setTextSize(0, loxVar.h());
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setPadding(loxVar.c(), loxVar.f(), loxVar.d(), loxVar.e());
        textView.setSingleLine();
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, gbg.b(this.mContext, 30.0f)));
        return textView;
    }

    private void addTab(final String str, int i, TextView textView, final List<loy> list, final lox loxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f71d012", new Object[]{this, str, new Integer(i), textView, list, loxVar});
        } else if (list == null) {
        } else {
            String a2 = this.mDataParse.a(i, list);
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            textView.setText(a2);
            textView.setTag(Integer.valueOf(i));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.ScrollTabView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        ScrollTabView.access$000(ScrollTabView.this, str, view, list, loxVar);
                    }
                }
            });
            this.mTabsContainer.addView(textView, i);
        }
    }

    private void dealClick(String str, View view, List<loy> list, lox loxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2786191", new Object[]{this, str, view, list, loxVar});
            return;
        }
        int clickPosition = getClickPosition(view);
        if (clickPosition == -1 || this.mCurrentTab == clickPosition || this.mOnTabClickedListener == null) {
            return;
        }
        this.mCurrentTab = clickPosition;
        scrollToCurrentTab();
        updateTabStyles(loxVar);
        this.mOnTabClickedListener.a(clickPosition, assembleMulticlassTabModel(str, list, clickPosition));
    }

    private loi assembleMulticlassTabModel(String str, List<loy> list, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (loi) ipChange.ipc$dispatch("b6f12164", new Object[]{this, str, list, new Integer(i)}) : new loi(str, this.mDataParse.a(list, i), new lok(gbg.b(this.mContext, 30.0f), null));
    }

    private int getClickPosition(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ac67b63", new Object[]{this, view})).intValue();
        }
        Object tag = view.getTag();
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    private void initTabColor(TextView textView, boolean z, lox loxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2667250", new Object[]{this, textView, new Boolean(z), loxVar});
            return;
        }
        if (z) {
            textView.setTextColor(loxVar.a());
            textView.setTextSize(0, loxVar.g());
            textView.setAlpha(1.0f);
            textView.getPaint().setFakeBoldText(true);
        } else {
            textView.setTextColor(loxVar.b());
            textView.setTextSize(0, loxVar.h());
            textView.getPaint().setFakeBoldText(false);
            textView.setAlpha(0.9f);
        }
        textView.setPadding(loxVar.c(), loxVar.f(), loxVar.d(), loxVar.e());
    }

    private void exposureShownTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54eb5df2", new Object[]{this});
            return;
        }
        Iterator<View> it = this.mWaitToExpViews.iterator();
        Rect rect = new Rect();
        getHitRect(rect);
        while (it.hasNext()) {
            View next = it.next();
            if (!next.getLocalVisibleRect(rect)) {
                return;
            }
            Object tag = next.getTag();
            if (tag instanceof Integer) {
                ljh.a(this.mTabItems.get(((Integer) tag).intValue()).b(), (JSONObject) null);
            }
            it.remove();
        }
    }
}
