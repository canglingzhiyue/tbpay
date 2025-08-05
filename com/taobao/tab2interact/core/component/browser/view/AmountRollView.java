package com.taobao.tab2interact.core.component.browser.view;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.utils.e;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.ohd;
import tb.ohj;
import tb.riy;

/* loaded from: classes8.dex */
public class AmountRollView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SHADOW_URL = "https://img.alicdn.com/imgextra/i1/O1CN01CV0ZQl1SAOb7VJALC_!!6000000002206-2-tps-90-90.png";
    private static final String TAG = "AmountRollView";
    private String mAmountDecimalPoint;
    private String mAmountUnit;
    private final Context mContext;
    private int mCurrentAmount;
    private long mCurrentDuration;
    private TextView mDecimalPointTextView;
    private ViewSwitcher.ViewFactory mFactory;
    private long mFragmentDuration;
    private Handler mHandler;
    private boolean mInitAnim;
    private boolean mIsAddingAmount;
    private boolean mIsInitialized;
    private a mListener;
    private long mSingleChangeDuration;
    private boolean mStopAnim;
    private TextSwitcher mSwitchHundreds;
    private TextSwitcher mSwitchOnes;
    private TextSwitcher mSwitchTens;
    private TextSwitcher mSwitchThousands;
    private List<TextSwitcher> mSwitcherList;
    private int mTotalAmount;
    private long mTotalDuration;
    private TextView mUnitTextView;
    private Runnable runnable;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, int i2, long j, long j2, long j3);
    }

    static {
        kge.a(1124935588);
    }

    public static /* synthetic */ Object ipc$super(AmountRollView amountRollView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6cc2506", new Object[]{amountRollView})).booleanValue() : amountRollView.mStopAnim;
    }

    public static /* synthetic */ boolean access$002(AmountRollView amountRollView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("679b2054", new Object[]{amountRollView, new Boolean(z)})).booleanValue();
        }
        amountRollView.mStopAnim = z;
        return z;
    }

    public static /* synthetic */ int access$100(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da7a4fb6", new Object[]{amountRollView})).intValue() : amountRollView.mCurrentAmount;
    }

    public static /* synthetic */ Handler access$1000(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("2918bc75", new Object[]{amountRollView}) : amountRollView.mHandler;
    }

    public static /* synthetic */ int access$102(AmountRollView amountRollView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9b20dd1", new Object[]{amountRollView, new Integer(i)})).intValue();
        }
        amountRollView.mCurrentAmount = i;
        return i;
    }

    public static /* synthetic */ void access$1100(AmountRollView amountRollView, TextSwitcher textSwitcher, char c, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("467e1c3d", new Object[]{amountRollView, textSwitcher, new Character(c), new Long(j)});
        } else {
            amountRollView.digitalPlusOne(textSwitcher, c, j);
        }
    }

    public static /* synthetic */ boolean access$1202(AmountRollView amountRollView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9da6b43", new Object[]{amountRollView, new Boolean(z)})).booleanValue();
        }
        amountRollView.mIsAddingAmount = z;
        return z;
    }

    public static /* synthetic */ Context access$1300(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("54b62dec", new Object[]{amountRollView}) : amountRollView.mContext;
    }

    public static /* synthetic */ int access$200(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e287a77", new Object[]{amountRollView})).intValue() : amountRollView.mTotalAmount;
    }

    public static /* synthetic */ int access$202(AmountRollView amountRollView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebc93b30", new Object[]{amountRollView, new Integer(i)})).intValue();
        }
        amountRollView.mTotalAmount = i;
        return i;
    }

    public static /* synthetic */ void access$300(AmountRollView amountRollView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fe765e", new Object[]{amountRollView, new Integer(i)});
        } else {
            amountRollView.initCurrentValue(i);
        }
    }

    public static /* synthetic */ long access$400(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7584cffa", new Object[]{amountRollView})).longValue() : amountRollView.mFragmentDuration;
    }

    public static /* synthetic */ long access$402(AmountRollView amountRollView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ff799b0", new Object[]{amountRollView, new Long(j)})).longValue();
        }
        amountRollView.mFragmentDuration = j;
        return j;
    }

    public static /* synthetic */ long access$500(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a932fabb", new Object[]{amountRollView})).longValue() : amountRollView.mTotalDuration;
    }

    public static /* synthetic */ long access$600(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dce1257c", new Object[]{amountRollView})).longValue() : amountRollView.mCurrentDuration;
    }

    public static /* synthetic */ long access$602(AmountRollView amountRollView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f425f46e", new Object[]{amountRollView, new Long(j)})).longValue();
        }
        amountRollView.mCurrentDuration = j;
        return j;
    }

    public static /* synthetic */ void access$700(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108f5049", new Object[]{amountRollView});
        } else {
            amountRollView.notifyAmountRollChanged();
        }
    }

    public static /* synthetic */ long access$800(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("443d7afe", new Object[]{amountRollView})).longValue() : amountRollView.mSingleChangeDuration;
    }

    public static /* synthetic */ void access$900(AmountRollView amountRollView, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba7c32c", new Object[]{amountRollView, new Integer(i), new Long(j)});
        } else {
            amountRollView.plusOne(i, j);
        }
    }

    public AmountRollView(Context context) {
        this(context, null);
    }

    public AmountRollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AmountRollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.runnable = new Runnable() { // from class: com.taobao.tab2interact.core.component.browser.view.AmountRollView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AmountRollView.access$000(AmountRollView.this)) {
                } else {
                    if (AmountRollView.access$100(AmountRollView.this) >= AmountRollView.access$200(AmountRollView.this)) {
                        AmountRollView amountRollView = AmountRollView.this;
                        AmountRollView.access$300(amountRollView, AmountRollView.access$200(amountRollView));
                        AmountRollView amountRollView2 = AmountRollView.this;
                        AmountRollView.access$102(amountRollView2, AmountRollView.access$200(amountRollView2));
                        AmountRollView amountRollView3 = AmountRollView.this;
                        AmountRollView.access$402(amountRollView3, AmountRollView.access$400(amountRollView3) + (AmountRollView.access$500(AmountRollView.this) - AmountRollView.access$600(AmountRollView.this)));
                        AmountRollView amountRollView4 = AmountRollView.this;
                        AmountRollView.access$602(amountRollView4, AmountRollView.access$500(amountRollView4));
                        AmountRollView.access$700(AmountRollView.this);
                        com.taobao.tab2interact.core.utils.a.b(this, AmountRollView.TAG, "进行一次金额翻滚，当前金额大于等于总金额，amountRollView=" + AmountRollView.this);
                        return;
                    }
                    AmountRollView.access$700(AmountRollView.this);
                    if (AmountRollView.access$000(AmountRollView.this)) {
                        return;
                    }
                    AmountRollView amountRollView5 = AmountRollView.this;
                    AmountRollView.access$402(amountRollView5, AmountRollView.access$800(amountRollView5));
                    AmountRollView amountRollView6 = AmountRollView.this;
                    AmountRollView.access$900(amountRollView6, AmountRollView.access$100(amountRollView6), AmountRollView.access$400(AmountRollView.this));
                    AmountRollView amountRollView7 = AmountRollView.this;
                    AmountRollView.access$102(amountRollView7, AmountRollView.access$100(amountRollView7) + 1);
                    AmountRollView amountRollView8 = AmountRollView.this;
                    AmountRollView.access$602(amountRollView8, AmountRollView.access$600(amountRollView8) + AmountRollView.access$400(AmountRollView.this));
                    AmountRollView.access$1000(AmountRollView.this).postDelayed(this, AmountRollView.access$400(AmountRollView.this));
                    com.taobao.tab2interact.core.utils.a.b(this, AmountRollView.TAG, "进行一次金额翻滚，当前金额小于总金额，amountRollView=" + AmountRollView.this);
                }
            }
        };
        this.mFactory = new ViewSwitcher.ViewFactory() { // from class: com.taobao.tab2interact.core.component.browser.view.AmountRollView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.ViewSwitcher.ViewFactory
            public View makeView() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (View) ipChange.ipc$dispatch("f2361e7c", new Object[]{this});
                }
                TextView textView = new TextView(AmountRollView.access$1300(AmountRollView.this));
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 81));
                textView.setGravity(17);
                textView.setTextColor(-1);
                textView.setTextSize(0, ohd.a(AmountRollView.this.getContext(), 26));
                textView.setTypeface(ohj.a(AmountRollView.access$1300(AmountRollView.this), e.ALI_SANS_TYPEFACE_ASSET_PATH, null, false, false));
                return textView;
            }
        };
        this.mContext = context;
        this.mHandler = new Handler();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "初始化");
        if (this.mIsInitialized) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "初始化，已经被初始化");
            return;
        }
        LayoutInflater.from(this.mContext).inflate(R.layout.browser_badge_amount_roll_layout, this);
        this.mSwitchThousands = (TextSwitcher) findViewById(R.id.digital_thousands_switch_view);
        this.mSwitchThousands.setFactory(this.mFactory);
        this.mSwitchHundreds = (TextSwitcher) findViewById(R.id.digital_hundreds_switch_view);
        this.mSwitchHundreds.setFactory(this.mFactory);
        this.mSwitchTens = (TextSwitcher) findViewById(R.id.digital_tens_switch_view);
        this.mSwitchTens.setFactory(this.mFactory);
        this.mSwitchOnes = (TextSwitcher) findViewById(R.id.digital_ones_switch_view);
        this.mSwitchOnes.setFactory(this.mFactory);
        this.mUnitTextView = (TextView) findViewById(R.id.unit_text_view);
        this.mDecimalPointTextView = (TextView) findViewById(R.id.decimal_point_text_view);
        this.mUnitTextView.setTextSize(0, ohd.a(getContext(), 20));
        this.mDecimalPointTextView.setTextSize(0, ohd.a(getContext(), 26));
        Typeface a2 = ohj.a(this.mContext, e.ALI_SANS_TYPEFACE_ASSET_PATH, null, false, false);
        this.mUnitTextView.setTypeface(a2);
        this.mDecimalPointTextView.setTypeface(a2);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.shadow_url_image_view);
        tUrlImageView.setImageUrl(SHADOW_URL);
        ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
        layoutParams.width = ohd.a(getContext(), 90);
        layoutParams.height = ohd.a(getContext(), 90);
        this.mSwitcherList = new ArrayList();
        this.mSwitcherList.add(this.mSwitchThousands);
        this.mSwitcherList.add(this.mSwitchHundreds);
        this.mSwitcherList.add(this.mSwitchTens);
        this.mSwitcherList.add(this.mSwitchOnes);
        this.mIsInitialized = true;
    }

    public void initAmountRoll(int i, int i2, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db7bd38", new Object[]{this, new Integer(i), new Integer(i2), new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "初始化金额翻滚");
        if (!this.mIsInitialized) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "初始化金额翻滚，未被初始化");
            return;
        }
        boolean z = i2 < 0 || i < 0 || i > 9999 || i2 > 9999;
        boolean z2 = j < 0 || j2 < 0 || j > j2 || j3 <= 0;
        if (z || z2) {
            this.mInitAnim = false;
            this.mHandler.removeCallbacksAndMessages(null);
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "initAmountRoll failed. The amount value is invalid.");
            return;
        }
        this.mInitAnim = true;
        this.mStopAnim = true;
        this.mIsAddingAmount = false;
        this.mCurrentAmount = i;
        this.mTotalAmount = i2;
        this.mCurrentDuration = j;
        this.mTotalDuration = j2;
        this.mSingleChangeDuration = j3;
        int i3 = i2 - i;
        if (i3 > 0) {
            long j4 = i3;
            long j5 = j2 - j;
            if (j3 * j4 > j5) {
                this.mSingleChangeDuration = j5 / j4;
            }
        }
        initCurrentValue(i);
        this.mUnitTextView.setText(this.mAmountUnit);
        this.mDecimalPointTextView.setText(this.mAmountDecimalPoint);
        this.mHandler.removeCallbacksAndMessages(null);
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "初始化金额翻滚，初始化成功，amountRollView=" + this);
    }

    public void startAmountRoll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e097fe", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "开启金额翻滚");
        if (!this.mIsInitialized) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "开启金额翻滚，未被初始化");
        } else if (!this.mInitAnim) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "initAmountRoll not done yet when startAmountRoll");
        } else if (!this.mStopAnim) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "startAmountRoll has done");
        } else {
            this.mStopAnim = false;
            if (this.mIsAddingAmount) {
                com.taobao.tab2interact.core.utils.a.b(this, TAG, "is Adding Amount when startAmountRoll");
                return;
            }
            this.mFragmentDuration = 0L;
            this.mHandler.postDelayed(this.runnable, 0L);
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "开启金额翻滚，翻滚已开启，amountRollView=" + this);
        }
    }

    public void pauseAmountRoll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8009a692", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "暂停金额翻滚");
        if (!this.mIsInitialized) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "暂停金额翻滚，未被初始化");
        } else if (!this.mInitAnim) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "initAmountRoll not done yet when pauseAmountRoll");
        } else if (this.mStopAnim) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "pauseAmountRoll has done");
        } else {
            this.mStopAnim = true;
            if (this.mIsAddingAmount) {
                com.taobao.tab2interact.core.utils.a.b(this, TAG, "is Adding Amount when pauseAmountRoll");
                return;
            }
            this.mHandler.removeCallbacks(this.runnable);
            int i = this.mCurrentAmount;
            int i2 = this.mTotalAmount;
            if (i >= i2) {
                this.mCurrentAmount = i2;
                long j = this.mFragmentDuration;
                long j2 = this.mTotalDuration;
                this.mFragmentDuration = j + (j2 - this.mCurrentDuration);
                this.mCurrentDuration = j2;
            }
            notifyAmountRollChanged();
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "暂停金额翻滚，翻滚已暂停，amountRollView=" + this);
        }
    }

    public void addAmount(final int i) {
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da03d6a3", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "一次性地增加金额，finalTotalAmount=" + i);
        if (!this.mIsInitialized) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "一次性地增加金额，未被初始化");
        } else if (!this.mInitAnim) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "initAmountRoll not done yet when addAmount");
        } else if (i <= this.mTotalAmount) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "finalTotalAmount is not greater than mTotalAmount when addAmount");
        } else {
            boolean z = this.mStopAnim;
            pauseAmountRoll();
            this.mStopAnim = z;
            this.mIsAddingAmount = true;
            initCurrentValue(this.mCurrentAmount);
            int i3 = this.mCurrentAmount;
            final int i4 = (i3 + i) - this.mTotalAmount;
            String autoFillZero = autoFillZero(String.valueOf(i3));
            String autoFillZero2 = autoFillZero(String.valueOf(i4));
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "一次性地增加金额，准备增加金额，amountRollView=" + this);
            int i5 = 0;
            while (i5 < 4) {
                char charAt = autoFillZero.charAt(i5);
                final char charAt2 = autoFillZero2.charAt(i5);
                final int[] iArr = new int[i2];
                iArr[0] = ((charAt2 - charAt) + 10) % 10;
                if (iArr[0] != 0) {
                    final long j = this.mSingleChangeDuration / iArr[0];
                    final TextSwitcher textSwitcher = this.mSwitcherList.get(i5);
                    this.mHandler.post(new Runnable() { // from class: com.taobao.tab2interact.core.component.browser.view.AmountRollView.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            int[] iArr2 = iArr;
                            iArr2[0] = iArr2[0] - 1;
                            AmountRollView.access$1100(AmountRollView.this, textSwitcher, (char) (((((charAt2 - '0') - iArr2[0]) + 10) % 10) + 48), j);
                            if (iArr[0] <= 0) {
                                return;
                            }
                            AmountRollView.access$1000(AmountRollView.this).postDelayed(this, j);
                        }
                    });
                }
                i5++;
                i2 = 1;
            }
            this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.tab2interact.core.component.browser.view.AmountRollView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AmountRollView.access$102(AmountRollView.this, i4);
                    AmountRollView.access$202(AmountRollView.this, i);
                    AmountRollView.access$1000(AmountRollView.this).removeCallbacksAndMessages(null);
                    com.taobao.tab2interact.core.utils.a.b(this, AmountRollView.TAG, "一次性地增加金额，金额增加完成，amountRollView=" + AmountRollView.this);
                    AmountRollView.access$1202(AmountRollView.this, false);
                    if (AmountRollView.access$000(AmountRollView.this)) {
                        return;
                    }
                    AmountRollView.access$002(AmountRollView.this, true);
                    AmountRollView.this.startAmountRoll();
                }
            }, this.mSingleChangeDuration);
        }
    }

    public void setAmountUnit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd5c00f", new Object[]{this, str});
        } else {
            this.mAmountUnit = str;
        }
    }

    public void setDecimalPoint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a195ee12", new Object[]{this, str});
        } else {
            this.mAmountDecimalPoint = str;
        }
    }

    public void setAmountRollChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10939006", new Object[]{this, aVar});
        } else {
            this.mListener = aVar;
        }
    }

    private void initCurrentValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94a9fb4", new Object[]{this, new Integer(i)});
        } else {
            initCurrentValue(String.valueOf(i));
        }
    }

    private void initCurrentValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275d539", new Object[]{this, str});
            return;
        }
        int length = str.length();
        if (length == 1) {
            this.mSwitchOnes.setCurrentText(String.valueOf(str.charAt(0)));
            this.mSwitchTens.setCurrentText("0");
            this.mSwitchHundreds.setCurrentText("0");
            this.mSwitchThousands.setCurrentText("");
        } else if (length == 2) {
            this.mSwitchOnes.setCurrentText(String.valueOf(str.charAt(1)));
            this.mSwitchTens.setCurrentText(String.valueOf(str.charAt(0)));
            this.mSwitchHundreds.setCurrentText("0");
            this.mSwitchThousands.setCurrentText("");
        } else if (length == 3) {
            this.mSwitchOnes.setCurrentText(String.valueOf(str.charAt(2)));
            this.mSwitchTens.setCurrentText(String.valueOf(str.charAt(1)));
            this.mSwitchHundreds.setCurrentText(String.valueOf(str.charAt(0)));
            this.mSwitchThousands.setCurrentText("");
        } else if (length != 4) {
        } else {
            this.mSwitchOnes.setCurrentText(String.valueOf(str.charAt(3)));
            this.mSwitchTens.setCurrentText(String.valueOf(str.charAt(2)));
            this.mSwitchHundreds.setCurrentText(String.valueOf(str.charAt(1)));
            this.mSwitchThousands.setCurrentText(String.valueOf(str.charAt(0)));
        }
    }

    private void plusOne(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f551ec54", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        initCurrentValue(i);
        String autoFillZero = autoFillZero(String.valueOf(i));
        String autoFillZero2 = autoFillZero(String.valueOf(i + 1));
        for (int i2 = 0; i2 < 4; i2++) {
            if (!TextUtils.equals(String.valueOf(autoFillZero.charAt(i2)), String.valueOf(autoFillZero2.charAt(i2)))) {
                digitalPlusOne(this.mSwitcherList.get(i2), autoFillZero2.charAt(i2), j);
            }
        }
    }

    private void digitalPlusOne(TextSwitcher textSwitcher, char c, long j) {
        Interpolator accelerateDecelerateInterpolator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80134d4", new Object[]{this, textSwitcher, new Character(c), new Long(j)});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.cubicTo(0.2f, 0.55f, 0.11f, 1.06f, 1.0f, 1.0f);
            accelerateDecelerateInterpolator = new PathInterpolator(path);
        } else {
            accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        }
        translateAnimation.setInterpolator(accelerateDecelerateInterpolator);
        translateAnimation2.setInterpolator(accelerateDecelerateInterpolator);
        translateAnimation.setDuration(j);
        translateAnimation2.setDuration(j);
        textSwitcher.setInAnimation(translateAnimation);
        textSwitcher.setOutAnimation(translateAnimation2);
        if (textSwitcher == this.mSwitchThousands && c == '0') {
            textSwitcher.setText("");
        } else {
            textSwitcher.setText(String.valueOf(c));
        }
    }

    private String autoFillZero(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d4bc355", new Object[]{this, str});
        }
        int length = str.length();
        if (length >= 4) {
            return str;
        }
        int i = 4 - length;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("0");
        }
        sb.append(str);
        return sb.toString();
    }

    private void notifyAmountRollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218d513d", new Object[]{this});
        } else if (this.mListener == null) {
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "通知金额翻滚发生改变，amountRollView=" + this);
            this.mListener.a(this.mCurrentAmount, this.mTotalAmount, this.mCurrentDuration, this.mTotalDuration, this.mFragmentDuration);
        }
    }

    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
        } else {
            this.mHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{currentAmount=" + this.mCurrentAmount + "，totalAmount=" + this.mTotalAmount + "，singleChangeDuration=" + this.mSingleChangeDuration + "，currentDuration=" + this.mCurrentDuration + "，totalDuration=" + this.mTotalDuration + "，fragmentDuration=" + this.mFragmentDuration + riy.BLOCK_END_STR;
    }
}
