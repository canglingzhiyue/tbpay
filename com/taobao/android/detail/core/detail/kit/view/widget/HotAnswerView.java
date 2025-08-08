package com.taobao.android.detail.core.detail.kit.view.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.c;
import com.taobao.android.detail.core.model.datamodel.hot.HotAnswerModel;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.internal.ArtcParams;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.emu;
import tb.epj;
import tb.epl;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class HotAnswerView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CLOSE_MASK = 2;
    private static final int LINEARLAYOUT_ANSWER_ID = 3;
    private static final int LINEARLAYOUT_ID = 1;
    private static final int SHOW_MASK = 3;
    private static final int SHOW_TOAST = 1;
    private int LEFT_MARGIN;
    private final int SELECTED_COLOR;
    private final int SELECTED_TEXT_COLOR;
    private final int SELECT_COLOR;
    private final int SELECT_TEXT_COLOR;
    private final int TB_BACKGROUP_COLOR;
    private final int ZERO;
    private ArrayList<EditText> answer;
    private a answerCb;
    private int answerHeight;
    private LinearLayout answerLayout;
    private int answerWidth;
    private GradientDrawable answerbord;
    private GradientDrawable answerbording;
    private View.OnClickListener anwerListener;
    private Boolean canClick;
    private int currAnswerIndex;
    private float density;
    private DetailImageView imageView;
    private boolean isInitedSelectView;
    private Handler mHandler;
    private HotAnswerModel mHotAnswerModel;
    public View mProgressBar;
    private int mWidth;
    private GridView selectView;
    private float textSize;
    private Toast theToast;

    /* loaded from: classes4.dex */
    public interface a {
    }

    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public Integer f9591a;
        public View b;

        static {
            kge.a(-714004512);
        }

        public b() {
        }
    }

    static {
        kge.a(-1082312195);
    }

    public static /* synthetic */ Object ipc$super(HotAnswerView hotAnswerView, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dd345b00", new Object[]{hotAnswerView})).intValue() : hotAnswerView.answerHeight;
    }

    public static /* synthetic */ int access$100(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1f4b885f", new Object[]{hotAnswerView})).intValue() : hotAnswerView.SELECT_COLOR;
    }

    public static /* synthetic */ GradientDrawable access$1000(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("5375156c", new Object[]{hotAnswerView}) : hotAnswerView.answerbording;
    }

    public static /* synthetic */ void access$1100(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5c789d", new Object[]{hotAnswerView});
        } else {
            hotAnswerView.showProgress();
        }
    }

    public static /* synthetic */ Toast access$1200(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Toast) ipChange.ipc$dispatch("f5a1feed", new Object[]{hotAnswerView}) : hotAnswerView.theToast;
    }

    public static /* synthetic */ Toast access$1202(HotAnswerView hotAnswerView, Toast toast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toast) ipChange.ipc$dispatch("f48b08fc", new Object[]{hotAnswerView, toast});
        }
        hotAnswerView.theToast = toast;
        return toast;
    }

    public static /* synthetic */ float access$200(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6162b5bb", new Object[]{hotAnswerView})).floatValue() : hotAnswerView.textSize;
    }

    public static /* synthetic */ int access$300(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a379e31d", new Object[]{hotAnswerView})).intValue() : hotAnswerView.SELECT_TEXT_COLOR;
    }

    public static /* synthetic */ void access$400(HotAnswerView hotAnswerView, CompoundButton compoundButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451c6f0", new Object[]{hotAnswerView, compoundButton});
        } else {
            hotAnswerView.compoundButtonChecked(compoundButton);
        }
    }

    public static /* synthetic */ float access$500(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("27a83dd8", new Object[]{hotAnswerView})).floatValue() : hotAnswerView.density;
    }

    public static /* synthetic */ int access$600(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69bf6b3a", new Object[]{hotAnswerView})).intValue() : hotAnswerView.TB_BACKGROUP_COLOR;
    }

    public static /* synthetic */ ArrayList access$700(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("4fb4ad80", new Object[]{hotAnswerView}) : hotAnswerView.answer;
    }

    public static /* synthetic */ int access$800(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ededc5f8", new Object[]{hotAnswerView})).intValue() : hotAnswerView.currAnswerIndex;
    }

    public static /* synthetic */ int access$802(HotAnswerView hotAnswerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3727c313", new Object[]{hotAnswerView, new Integer(i)})).intValue();
        }
        hotAnswerView.currAnswerIndex = i;
        return i;
    }

    public static /* synthetic */ GradientDrawable access$900(HotAnswerView hotAnswerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("1941186", new Object[]{hotAnswerView}) : hotAnswerView.answerbord;
    }

    public HotAnswerView(Context context) {
        this(context, null);
    }

    public HotAnswerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HotAnswerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ZERO = 0;
        this.LEFT_MARGIN = 0;
        this.SELECTED_COLOR = Color.rgb((int) AConstants.ArtcErrorServerErrorDropByMobility, (int) AConstants.ArtcErrorServerErrorDropByMobility, (int) AConstants.ArtcErrorServerErrorDropByMobility);
        this.SELECTED_TEXT_COLOR = Color.rgb(187, 187, 187);
        this.SELECT_TEXT_COLOR = Color.rgb(76, 81, 91);
        this.SELECT_COLOR = Color.rgb((int) ArtcParams.SD244pVideoParams.WIDTH, (int) ArtcParams.SD244pVideoParams.WIDTH, (int) ArtcParams.SD244pVideoParams.WIDTH);
        this.TB_BACKGROUP_COLOR = Color.rgb(228, 228, 228);
        this.answer = new ArrayList<>();
        this.currAnswerIndex = 0;
        this.canClick = false;
        this.anwerListener = new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.HotAnswerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (view == null) {
                } else {
                    Object tag = view.getTag();
                    if (!(tag instanceof b) || !(view instanceof EditText)) {
                        return;
                    }
                    b bVar = (b) tag;
                    if (bVar.f9591a != null && bVar.f9591a.intValue() < HotAnswerView.access$700(HotAnswerView.this).size() && HotAnswerView.access$800(HotAnswerView.this) < HotAnswerView.access$700(HotAnswerView.this).size()) {
                        ((EditText) HotAnswerView.access$700(HotAnswerView.this).get(HotAnswerView.access$800(HotAnswerView.this))).setBackgroundDrawable(HotAnswerView.access$900(HotAnswerView.this));
                        ((EditText) view).setText("");
                        HotAnswerView.access$802(HotAnswerView.this, bVar.f9591a.intValue());
                        if (bVar.b != null) {
                            bVar.b.setBackgroundColor(HotAnswerView.access$100(HotAnswerView.this));
                            bVar.b.setEnabled(true);
                            if (bVar.b instanceof Button) {
                                ((Button) bVar.b).getPaint().setColor(HotAnswerView.access$300(HotAnswerView.this));
                            }
                        }
                    }
                    view.setBackgroundDrawable(HotAnswerView.access$1000(HotAnswerView.this));
                }
            }
        };
        this.theToast = null;
        this.mHandler = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.detail.core.detail.kit.view.widget.HotAnswerView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == 72182663) {
                    super.dispatchMessage((Message) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                    return;
                }
                super.dispatchMessage(message);
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        HotAnswerView.this.hideProgress();
                        return;
                    } else if (i2 != 3) {
                        return;
                    } else {
                        HotAnswerView.access$1100(HotAnswerView.this);
                        return;
                    }
                }
                HotAnswerView.this.hideProgress();
                if (HotAnswerView.access$1200(HotAnswerView.this) == null) {
                    HotAnswerView hotAnswerView = HotAnswerView.this;
                    HotAnswerView.access$1202(hotAnswerView, Toast.makeText(hotAnswerView.getContext(), "", 3000));
                }
                HotAnswerView.access$1200(HotAnswerView.this).setText(String.valueOf(message.obj));
                HotAnswerView.access$1200(HotAnswerView.this).show();
            }
        };
        setBackgroundColor(Color.rgb(234, 234, 234));
        this.density = getResources().getDisplayMetrics().density;
        this.textSize = this.density * 24.0f;
        this.answerbording = new GradientDrawable();
        this.answerbording.setColor(-1);
        this.answerbording.setStroke((int) Math.ceil(this.density), Color.rgb(251, 61, 8));
        this.answerbord = new GradientDrawable();
        this.answerbord.setColor(-1);
        this.answerbord.setStroke((int) Math.ceil(this.density), Color.rgb(193, 193, 193));
        initView();
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.HotAnswerView");
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        int ceil = (int) Math.ceil(this.density * 40.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(1);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(9, -1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setPadding(ceil, ceil, ceil, ceil);
        addView(linearLayout);
        this.imageView = new DetailImageView(getContext());
        this.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.imageView.setBackgroundDrawable(this.answerbord);
        this.imageView.setLayoutParams(new LinearLayout.LayoutParams(ceil * 7, ceil * 2));
        linearLayout.addView(this.imageView);
        this.answerLayout = new LinearLayout(getContext());
        this.answerLayout.setId(3);
        this.answerLayout.setOrientation(0);
        this.answerLayout.setGravity(3);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = ceil / 2;
        this.answerLayout.setLayoutParams(layoutParams2);
        linearLayout.addView(this.answerLayout);
    }

    public HotAnswerView initData(HotAnswerModel hotAnswerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HotAnswerView) ipChange.ipc$dispatch("c6c7899", new Object[]{this, hotAnswerModel});
        }
        this.mHotAnswerModel = hotAnswerModel;
        if (this.isInitedSelectView) {
            initAnswerImage(this.mHotAnswerModel.question);
            initAnswerView(this.mHotAnswerModel.len);
            initSelectView(this.mHotAnswerModel.getTip());
        }
        return this;
    }

    public void registerListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73f8809", new Object[]{this, aVar});
        } else {
            this.answerCb = aVar;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.isInitedSelectView || getWidth() <= 0) {
            return;
        }
        this.mWidth = getWidth();
        this.answerWidth = (int) Math.ceil(this.density * 58.0f);
        float f = this.density;
        this.answerHeight = (int) Math.ceil((((((epo.c - c.a(getContext())) - this.imageView.getBottom()) - (20.0f * f)) - (f * 40.0f)) - this.answerWidth) / 4.0f);
        this.textSize = Math.min(this.answerWidth, this.answerHeight) / 2;
        HotAnswerModel hotAnswerModel = this.mHotAnswerModel;
        if (hotAnswerModel != null) {
            initAnswerImage(hotAnswerModel.question);
            initAnswerView(this.mHotAnswerModel.len);
            initSelectView(this.mHotAnswerModel.getTip());
        }
        initProgressView();
        View view = this.mProgressBar;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(this.mProgressBar);
        this.isInitedSelectView = true;
        invalidate();
    }

    private void initAnswerImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543e5bde", new Object[]{this, str});
        } else {
            loadImageDrawable(str, this.imageView);
        }
    }

    public void loadImageDrawable(String str, DetailImageView detailImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f181de5", new Object[]{this, str, detailImageView});
        } else {
            epj.b().a(str, detailImageView, new epl.a().b(R.drawable.detail_seckill_qstloadfail).a(R.drawable.detail_picture_load).a(), (com.taobao.android.detail.datasdk.protocol.image.b) null);
        }
    }

    private void initSelectView(final ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7694db2", new Object[]{this, arrayList});
            return;
        }
        if (this.selectView == null) {
            Math.ceil(this.density * 10.0f);
            this.selectView = new GridView(getContext());
            this.selectView.setNumColumns(4);
            this.selectView.setGravity(17);
            this.selectView.setVerticalSpacing(0);
            this.selectView.setHorizontalSpacing(0);
            this.selectView.setCacheColorHint(0);
            this.selectView.setSelector(new ColorDrawable(0));
            this.selectView.setStretchMode(2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(5, 1);
            layoutParams.addRule(3, 3);
            layoutParams.addRule(12, -1);
            this.selectView.setLayoutParams(layoutParams);
            addView(this.selectView);
        }
        BaseAdapter baseAdapter = new BaseAdapter() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.HotAnswerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.Adapter
            public long getItemId(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    return arrayList2.size();
                }
                return 0;
            }

            @Override // android.widget.Adapter
            public Object getItem(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : arrayList.get(i);
            }

            @Override // android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View childAt;
                CompoundButton compoundButton;
                View view2;
                View view3;
                View view4;
                RelativeLayout relativeLayout;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
                }
                if (view == null) {
                    RelativeLayout relativeLayout2 = new RelativeLayout(HotAnswerView.this.getContext());
                    relativeLayout2.setLayoutParams(new AbsListView.LayoutParams(-1, HotAnswerView.access$000(HotAnswerView.this)));
                    compoundButton = new CompoundButton(HotAnswerView.this.getContext()) { // from class: com.taobao.android.detail.core.detail.kit.view.widget.HotAnswerView.1.1
                    };
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams2.addRule(13, -1);
                    compoundButton.setLayoutParams(layoutParams2);
                    compoundButton.setTextColor(-16777216);
                    compoundButton.setBackgroundColor(HotAnswerView.access$100(HotAnswerView.this));
                    TextPaint paint = compoundButton.getPaint();
                    paint.setTextSize(HotAnswerView.access$200(HotAnswerView.this));
                    paint.setColor(HotAnswerView.access$300(HotAnswerView.this));
                    compoundButton.setGravity(17);
                    compoundButton.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.HotAnswerView.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view5) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view5});
                            } else {
                                HotAnswerView.access$400(HotAnswerView.this, (CompoundButton) view5);
                            }
                        }
                    });
                    relativeLayout2.addView(compoundButton);
                    view2 = new View(HotAnswerView.this.getContext());
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) HotAnswerView.access$500(HotAnswerView.this));
                    layoutParams3.addRule(10, -1);
                    view2.setLayoutParams(layoutParams3);
                    view2.setBackgroundColor(HotAnswerView.access$600(HotAnswerView.this));
                    relativeLayout2.addView(view2);
                    view4 = new View(HotAnswerView.this.getContext());
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) HotAnswerView.access$500(HotAnswerView.this), -1);
                    layoutParams4.addRule(9, -1);
                    view4.setLayoutParams(layoutParams4);
                    view4.setBackgroundColor(HotAnswerView.access$600(HotAnswerView.this));
                    relativeLayout2.addView(view4);
                    view3 = new View(HotAnswerView.this.getContext());
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) HotAnswerView.access$500(HotAnswerView.this), -1);
                    layoutParams5.addRule(11, -1);
                    view3.setLayoutParams(layoutParams5);
                    view3.setBackgroundColor(HotAnswerView.access$600(HotAnswerView.this));
                    relativeLayout2.addView(view3);
                    childAt = new View(HotAnswerView.this.getContext());
                    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, (int) HotAnswerView.access$500(HotAnswerView.this));
                    layoutParams6.addRule(12, -1);
                    childAt.setLayoutParams(layoutParams6);
                    childAt.setBackgroundColor(HotAnswerView.access$600(HotAnswerView.this));
                    relativeLayout2.addView(childAt);
                    relativeLayout = relativeLayout2;
                } else {
                    RelativeLayout relativeLayout3 = (RelativeLayout) view;
                    View childAt2 = relativeLayout3.getChildAt(1);
                    View childAt3 = relativeLayout3.getChildAt(2);
                    View childAt4 = relativeLayout3.getChildAt(3);
                    childAt = relativeLayout3.getChildAt(4);
                    compoundButton = (CompoundButton) relativeLayout3.getChildAt(0);
                    view2 = childAt2;
                    view3 = childAt4;
                    view4 = childAt3;
                    relativeLayout = view;
                }
                if (i / 4 == 0) {
                    view2.setVisibility(8);
                } else {
                    view2.setVisibility(0);
                }
                if (i % 4 == 0) {
                    view4.setVisibility(8);
                } else {
                    view4.setVisibility(0);
                }
                if ((i + 1) % 4 == 0) {
                    view3.setVisibility(8);
                } else {
                    view3.setVisibility(0);
                }
                if (((getCount() - i) - 1) / 4 == 0) {
                    childAt.setVisibility(8);
                } else {
                    childAt.setVisibility(0);
                }
                compoundButton.setText((CharSequence) arrayList.get(i));
                compoundButton.setTag(arrayList.get(i));
                return relativeLayout;
            }
        };
        this.selectView.setAdapter((ListAdapter) baseAdapter);
        baseAdapter.notifyDataSetChanged();
    }

    private void initAnswerView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51916a89", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.answerWidth;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        this.LEFT_MARGIN = (this.imageView.getWidth() - (this.answerWidth * i)) / (i + 1);
        int i3 = 0;
        while (i3 < i) {
            layoutParams.leftMargin = this.LEFT_MARGIN;
            EditText editText = new EditText(getContext());
            editText.setFocusable(false);
            editText.setGravity(17);
            editText.setLayoutParams(layoutParams);
            editText.setTextColor(-16777216);
            editText.setBackgroundDrawable(i3 == 0 ? this.answerbording : this.answerbord);
            editText.setOnClickListener(this.anwerListener);
            editText.getPaint().setTextSize(this.textSize);
            this.answerLayout.addView(editText);
            this.answer.add(editText);
            i3++;
        }
    }

    private void compoundButtonChecked(CompoundButton compoundButton) {
        int i;
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3dbbac8", new Object[]{this, compoundButton});
        } else if ((this.answer == null && !this.canClick.booleanValue()) || (i = this.currAnswerIndex) < 0 || i >= this.answer.size() || (editText = this.answer.get(this.currAnswerIndex)) == null || editText.getText() == null || !StringUtils.isEmpty(editText.getText().toString())) {
        } else {
            editText.setText(compoundButton.getTag().toString());
            b bVar = new b();
            bVar.f9591a = Integer.valueOf(this.currAnswerIndex);
            bVar.b = compoundButton;
            editText.setBackgroundDrawable(this.answerbord);
            compoundButton.setBackgroundColor(this.SELECTED_COLOR);
            compoundButton.getPaint().setColor(this.SELECTED_TEXT_COLOR);
            compoundButton.setEnabled(false);
            editText.setTag(bVar);
            int nextAnswer = getNextAnswer(-1);
            if (nextAnswer < this.answer.size()) {
                this.currAnswerIndex = nextAnswer;
                this.answer.get(this.currAnswerIndex).setBackgroundDrawable(this.answerbording);
            }
            submitOrder();
        }
    }

    private int getNextAnswer(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35170f28", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = i + 1;
        if (i2 < 0 || i2 >= this.answer.size()) {
            return i2;
        }
        EditText editText = this.answer.get(i2);
        return (editText.getText() == null || StringUtils.isEmpty(editText.getText().toString())) ? i2 : getNextAnswer(i2);
    }

    private void submitOrder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd72f9d", new Object[]{this});
        } else if (this.answer == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator<EditText> it = this.answer.iterator();
            while (it.hasNext()) {
                EditText next = it.next();
                if (next.getText() == null || StringUtils.isEmpty(next.getText().toString())) {
                    return;
                }
                sb.append((CharSequence) next.getText());
            }
            showMask();
            if (this.answerCb == null) {
                return;
            }
            sb.toString();
        }
    }

    private void showMask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8b2790", new Object[]{this});
        } else {
            this.mHandler.sendEmptyMessage(3);
        }
    }

    public void initProgressView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b31729", new Object[]{this});
        } else if (this.mProgressBar != null) {
        } else {
            this.mProgressBar = new ProgressBar(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13, -1);
            this.mProgressBar.setLayoutParams(layoutParams);
        }
    }

    private void showProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83b03d1", new Object[]{this});
            return;
        }
        View view = this.mProgressBar;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public void hideProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713c696", new Object[]{this});
            return;
        }
        View view = this.mProgressBar;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }
}
