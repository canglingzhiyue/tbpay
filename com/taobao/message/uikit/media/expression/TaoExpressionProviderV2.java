package com.taobao.message.uikit.media.expression;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.uikit.provider.ExpressionProvider2;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class TaoExpressionProviderV2 implements ExpressionProvider2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaoExpressionProviderV2";
    public static volatile TaoExpressionProviderV2 mInstance;
    private SparseArray<Expression> expressions = null;
    private final Map<String, SparseArray<Expression>> expressionMap = new HashMap();

    public static /* synthetic */ Map access$000(TaoExpressionProviderV2 taoExpressionProviderV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9fcc45dc", new Object[]{taoExpressionProviderV2}) : taoExpressionProviderV2.expressionMap;
    }

    static {
        kge.a(1160896483);
        kge.a(-2009209837);
        mInstance = null;
    }

    public static TaoExpressionProviderV2 getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoExpressionProviderV2) ipChange.ipc$dispatch("de0413c0", new Object[0]);
        }
        if (mInstance == null) {
            synchronized (TaoExpressionProviderV2.class) {
                if (mInstance == null) {
                    mInstance = new TaoExpressionProviderV2();
                }
            }
        }
        return mInstance;
    }

    public TaoExpressionProviderV2() {
        this.expressionMap.put("im", getExpressionTable());
    }

    @Override // com.taobao.message.uikit.provider.ExpressionProvider
    public SparseArray<Expression> getExpressionTable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("85ffd0f2", new Object[]{this});
        }
        if (this.expressions == null) {
            this.expressions = new SparseArray<Expression>(100) { // from class: com.taobao.message.uikit.media.expression.TaoExpressionProviderV2.1
                {
                    put(0, new Expression(0, R.drawable.fc001, "/:^_^", DisplayUtil.localizedString(R.string.mp_smile)));
                    put(1, new Expression(1, R.drawable.fc002, "/:^$^", DisplayUtil.localizedString(R.string.mp_shy)));
                    put(2, new Expression(2, R.drawable.fc003, "/:Q", DisplayUtil.localizedString(R.string.mp_sticking_tongue_out)));
                    put(3, new Expression(3, R.drawable.fc023, "/:065", DisplayUtil.localizedString(R.string.mp_angel)));
                    put(4, new Expression(4, R.drawable.fc005, "/:809", DisplayUtil.localizedString(R.string.mp_love_1)));
                    put(5, new Expression(5, R.drawable.fc049, "/:018", DisplayUtil.localizedString(R.string.mp_weeping)));
                    put(6, new Expression(6, R.drawable.fc007, "/:081", DisplayUtil.localizedString(R.string.mp_dancing)));
                    put(7, new Expression(7, R.drawable.fc008, "/:087", DisplayUtil.localizedString(R.string.mp_kiss)));
                    put(8, new Expression(8, R.drawable.fc009, "/:086", DisplayUtil.localizedString(R.string.mp_comfort_1)));
                    put(9, new Expression(9, R.drawable.fc069, "/:803", DisplayUtil.localizedString(R.string.mp_make_a_fortune)));
                    put(10, new Expression(10, R.drawable.fc011, "/:012", DisplayUtil.localizedString(R.string.mp_come_on)));
                    put(11, new Expression(11, R.drawable.fc018, "/:066", DisplayUtil.localizedString(R.string.mp_call_1)));
                    put(12, new Expression(12, R.drawable.fc031, "/:?", DisplayUtil.localizedString(R.string.mp_doubt)));
                    put(13, new Expression(13, R.drawable.fc014, "/:^x^", DisplayUtil.localizedString(R.string.mp_kiss_1)));
                    put(14, new Expression(14, R.drawable.fc015, "/:814", DisplayUtil.localizedString(R.string.mp_anthomaniac)));
                    put(15, new Expression(15, R.drawable.fc004, "/:815", DisplayUtil.localizedString(R.string.mp_laughing)));
                    put(16, new Expression(16, R.drawable.fc006, "/:^O^", DisplayUtil.localizedString(R.string.mp_laugh)));
                    put(17, new Expression(17, R.drawable.fc070, "/:074", DisplayUtil.localizedString(R.string.mp_customer_assistant)));
                    put(18, new Expression(18, R.drawable.fc012, "/:806", DisplayUtil.localizedString(R.string.mp_victory)));
                    put(19, new Expression(19, R.drawable.fc081, "/:(OK)", DisplayUtil.localizedString(R.string.mp_deal)));
                    put(20, new Expression(20, R.drawable.fc083, "/:)-(", DisplayUtil.localizedString(R.string.mp_handshake)));
                    put(21, new Expression(21, R.drawable.fc087, "/:Y", DisplayUtil.localizedString(R.string.mp_love)));
                    put(22, new Expression(22, R.drawable.fc085, "/:-F", DisplayUtil.localizedString(R.string.mp_rose)));
                    put(23, new Expression(23, R.drawable.fc047, "/:810", DisplayUtil.localizedString(R.string.mp_sadness)));
                    put(24, new Expression(24, R.drawable.fc024, "/:804", DisplayUtil.localizedString(R.string.mp_goodbye)));
                    put(25, new Expression(25, R.drawable.fc025, "/:813", DisplayUtil.localizedString(R.string.mp_smile_1)));
                    put(26, new Expression(26, R.drawable.fc026, "/:818", DisplayUtil.localizedString(R.string.mp_enjoy)));
                    put(27, new Expression(27, R.drawable.fc027, "/:015", DisplayUtil.localizedString(R.string.mp_expectation)));
                    put(28, new Expression(28, R.drawable.fc028, "/:084", DisplayUtil.localizedString(R.string.mp_dull)));
                    put(29, new Expression(29, R.drawable.fc029, "/:801", DisplayUtil.localizedString(R.string.mp_thinking_1)));
                    put(30, new Expression(30, R.drawable.fc030, "/:811", DisplayUtil.localizedString(R.string.mp_confused)));
                    put(31, new Expression(31, R.drawable.fc046, "/:*&*", DisplayUtil.localizedString(R.string.mp_halo)));
                    put(32, new Expression(32, R.drawable.fc032, "/:077", DisplayUtil.localizedString(R.string.mp_chop_hands)));
                    put(33, new Expression(33, R.drawable.fc033, "/:083", DisplayUtil.localizedString(R.string.mp_boring)));
                    put(34, new Expression(34, R.drawable.fc034, "/:817", DisplayUtil.localizedString(R.string.mp_doubt_1)));
                    put(35, new Expression(35, R.drawable.fc035, "/:!", DisplayUtil.localizedString(R.string.mp_hush)));
                    put(36, new Expression(36, R.drawable.fc036, "/:068", DisplayUtil.localizedString(R.string.mp_do_something_wrong)));
                    put(37, new Expression(37, R.drawable.fc037, "/:079", DisplayUtil.localizedString(R.string.mp_not_easy)));
                    put(38, new Expression(38, R.drawable.fc038, "/:028", DisplayUtil.localizedString(R.string.mp_cold)));
                    put(39, new Expression(39, R.drawable.fc039, "/:026", DisplayUtil.localizedString(R.string.mp_embarrassed)));
                    put(40, new Expression(40, R.drawable.fc040, "/:007", DisplayUtil.localizedString(R.string.mp_giggle)));
                    put(41, new Expression(41, R.drawable.fc041, "/:816", DisplayUtil.localizedString(R.string.mp_no_way)));
                    put(42, new Expression(42, R.drawable.fc042, "/:'\"\"", DisplayUtil.localizedString(R.string.mp_it_s_too_difficult)));
                    put(43, new Expression(43, R.drawable.fc043, "/:802", DisplayUtil.localizedString(R.string.mp_sweat)));
                    put(44, new Expression(44, R.drawable.fc044, "/:027", DisplayUtil.localizedString(R.string.mp_desolation)));
                    put(45, new Expression(45, R.drawable.fc013, "/:b", DisplayUtil.localizedString(R.string.mp_strong)));
                    put(46, new Expression(46, R.drawable.fc045, "/:(Zz...)", DisplayUtil.localizedString(R.string.mp_sleepy)));
                    put(47, new Expression(47, R.drawable.fc020, "/:805", DisplayUtil.localizedString(R.string.mp_money_fans)));
                    put(48, new Expression(48, R.drawable.fc022, "/:072", DisplayUtil.localizedString(R.string.mp_grimace)));
                    put(49, new Expression(49, R.drawable.fc048, "/:>_<", DisplayUtil.localizedString(R.string.mp_grievance)));
                    put(50, new Expression(50, R.drawable.fc016, "/:^W^", DisplayUtil.localizedString(R.string.mp_grin)));
                    put(51, new Expression(51, R.drawable.fc050, "/:>O<", DisplayUtil.localizedString(R.string.mp_crying)));
                    put(52, new Expression(52, R.drawable.fc051, "/:020", DisplayUtil.localizedString(R.string.mp_cry_bitterly)));
                    put(53, new Expression(53, R.drawable.fc052, "/:044", DisplayUtil.localizedString(R.string.mp_i_took_u)));
                    put(54, new Expression(54, R.drawable.fc053, "/:819", DisplayUtil.localizedString(R.string.mp_sorry)));
                    put(55, new Expression(55, R.drawable.fc054, "/:085", DisplayUtil.localizedString(R.string.mp_cardiac_acid)));
                    put(56, new Expression(56, R.drawable.fc055, "/:812", DisplayUtil.localizedString(R.string.mp_frown)));
                    put(57, new Expression(57, R.drawable.fc056, "/:\"", DisplayUtil.localizedString(R.string.mp_so_tired)));
                    put(58, new Expression(58, R.drawable.fc017, "/:080", DisplayUtil.localizedString(R.string.mp_find)));
                    put(59, new Expression(59, R.drawable.fc058, "/:>@<", DisplayUtil.localizedString(R.string.mp_spit)));
                    put(60, new Expression(60, R.drawable.fc059, "/:076", DisplayUtil.localizedString(R.string.mp_back)));
                    put(61, new Expression(61, R.drawable.fc060, "/:069", DisplayUtil.localizedString(R.string.mp_surprised_1)));
                    put(62, new Expression(62, R.drawable.fc061, "/:O", DisplayUtil.localizedString(R.string.mp_stunned)));
                    put(63, new Expression(63, R.drawable.fc062, "/:067", DisplayUtil.localizedString(R.string.mp_shut_up)));
                    put(64, new Expression(64, R.drawable.fc063, "/:043", DisplayUtil.localizedString(R.string.mp_underflatted)));
                    put(65, new Expression(65, R.drawable.fc064, "/:P", DisplayUtil.localizedString(R.string.mp_despise_you)));
                    put(66, new Expression(66, R.drawable.fc065, "/:808", DisplayUtil.localizedString(R.string.mp_rage)));
                    put(67, new Expression(67, R.drawable.fc066, "/:>W<", DisplayUtil.localizedString(R.string.mp_angry)));
                    put(68, new Expression(68, R.drawable.fc019, "/:807", DisplayUtil.localizedString(R.string.mp_accounting)));
                    put(69, new Expression(69, R.drawable.fc021, "/:071", DisplayUtil.localizedString(R.string.mp_call)));
                    put(70, new Expression(70, R.drawable.fc072, "/:036", DisplayUtil.localizedString(R.string.mp_evil)));
                    put(71, new Expression(71, R.drawable.fc073, "/:039", DisplayUtil.localizedString(R.string.mp_single_pick)));
                    put(72, new Expression(72, R.drawable.fc071, "/:O=O", DisplayUtil.localizedString(R.string.mp_boss)));
                    put(73, new Expression(73, R.drawable.fc068, "/:008", DisplayUtil.localizedString(R.string.mp_please_drink_tea)));
                    put(74, new Expression(74, R.drawable.fc074, "/:045", DisplayUtil.localizedString(R.string.mp_wit)));
                    put(75, new Expression(75, R.drawable.fc075, "/:046", DisplayUtil.localizedString(R.string.mp_invisible_man)));
                    put(76, new Expression(76, R.drawable.fc076, "/:048", DisplayUtil.localizedString(R.string.mp_bomb)));
                    put(77, new Expression(77, R.drawable.fc082, "/:8*8", DisplayUtil.localizedString(R.string.mp_applause)));
                    put(78, new Expression(78, R.drawable.fc089, "/:$", DisplayUtil.localizedString(R.string.mp_red_envelope)));
                    put(79, new Expression(79, R.drawable.fc067, "/:073", DisplayUtil.localizedString(R.string.mp_god_of_wealth)));
                    put(80, new Expression(80, R.drawable.fc077, "/:047", DisplayUtil.localizedString(R.string.mp_scream)));
                    put(81, new Expression(81, R.drawable.fc080, "/:052", DisplayUtil.localizedString(R.string.mp_lucky_cat)));
                    put(82, new Expression(82, R.drawable.fc010, "/:H", DisplayUtil.localizedString(R.string.mp_hug)));
                    put(83, new Expression(83, R.drawable.fc098, "/:plane", DisplayUtil.localizedString(R.string.mp_aircraft)));
                    put(84, new Expression(84, R.drawable.fc095, "/:clock", DisplayUtil.localizedString(R.string.mp_clock)));
                    put(85, new Expression(85, R.drawable.fc084, "/:lip", DisplayUtil.localizedString(R.string.mp_red_lips)));
                    put(86, new Expression(86, R.drawable.fc086, "/:-W", DisplayUtil.localizedString(R.string.mp_residual_flower)));
                    put(87, new Expression(87, R.drawable.fc088, "/:qp", DisplayUtil.localizedString(R.string.mp_heartbreak)));
                    put(88, new Expression(88, R.drawable.fc091, "/:(&)", DisplayUtil.localizedString(R.string.mp_express_box)));
                    put(89, new Expression(89, R.drawable.fc097, "/:C", DisplayUtil.localizedString(R.string.mp_it_s_late)));
                    put(90, new Expression(90, R.drawable.fc079, "/:man", DisplayUtil.localizedString(R.string.mp_onlookers)));
                    put(91, new Expression(91, R.drawable.fc078, "/:girl", DisplayUtil.localizedString(R.string.mp_amazing)));
                    put(92, new Expression(92, R.drawable.fc096, "/:R", DisplayUtil.localizedString(R.string.mp_wait)));
                    put(93, new Expression(93, R.drawable.fc092, "/:@", DisplayUtil.localizedString(R.string.mp_receipt)));
                    put(94, new Expression(94, R.drawable.fc094, "/:U*U", DisplayUtil.localizedString(R.string.mp_toast_celebration)));
                    put(95, new Expression(95, R.drawable.fc090, "/:%", DisplayUtil.localizedString(R.string.mp_express_delivery)));
                    put(96, new Expression(96, R.drawable.fc099, "/:075", DisplayUtil.localizedString(R.string.mp_alipay)));
                    put(97, new Expression(97, R.drawable.fc093, "/:~B", DisplayUtil.localizedString(R.string.mp_telephone)));
                }
            };
        }
        return this.expressions;
    }

    @Override // com.taobao.message.uikit.provider.ExpressionProvider2
    public SparseArray<Expression> getExpressionTableByBiz(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("d5da0e7d", new Object[]{this, strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return getExpressionTableByBiz(new String[]{"im"});
        }
        if (strArr.length == 1) {
            return this.expressionMap.get(strArr[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            if (i != strArr.length - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        if (this.expressionMap.containsKey(sb2)) {
            return this.expressionMap.get(sb2);
        }
        SparseArray<Expression> sparseArray = new SparseArray<>();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            SparseArray<Expression> expressionTableByBiz = getExpressionTableByBiz(new String[]{strArr[i2]});
            if (expressionTableByBiz == null) {
                TLog.loge("emotion", "存在未注册的biz， 走降级逻辑");
                return this.expressionMap.get("im");
            }
            appendSparseArray(sparseArray, expressionTableByBiz);
        }
        this.expressionMap.put(sb2, sparseArray);
        return sparseArray;
    }

    private void appendSparseArray(SparseArray<Expression> sparseArray, SparseArray<Expression> sparseArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e9c7ac", new Object[]{this, sparseArray, sparseArray2});
            return;
        }
        int size = sparseArray.size();
        int size2 = sparseArray2.size();
        for (int i = 0; i < size2; i++) {
            Expression expression = sparseArray2.get(i);
            if (expression == null) {
                TLog.loge("appendSparseArray failed", "emotion");
            }
            sparseArray.append(size + i, expression);
        }
    }

    @Override // com.taobao.message.uikit.provider.ExpressionProvider2
    public void registerEmotionWithBiz(final String str, final List<Expression> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ca70d7", new Object[]{this, str, list});
        } else {
            UIHandler.postMain(new Runnable() { // from class: com.taobao.message.uikit.media.expression.TaoExpressionProviderV2.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!TaoExpressionProviderV2.access$000(TaoExpressionProviderV2.this).containsKey(str)) {
                        SparseArray sparseArray = new SparseArray();
                        for (int i = 0; i < list.size(); i++) {
                            Expression expression = (Expression) list.get(i);
                            if (expression.pathType == 2) {
                                TLog.loge("基础表情不支持网络资源图片", "emotion");
                            } else {
                                sparseArray.put(i, expression);
                            }
                        }
                        TaoExpressionProviderV2.access$000(TaoExpressionProviderV2.this).put(str, sparseArray);
                    }
                }
            });
        }
    }
}
