package com.taobao.message.chat.component.chatinput.node;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.j;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.model.a;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.m;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper;
import com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.message.lab.comfrm.support.dinamic.DxCustemDataEvent;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.gbh;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0003YZ[B\u0007\b\u0016¢\u0006\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u00020\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020\u0007H\u0017J\b\u0010*\u001a\u00020\u0007H\u0017J\n\u0010+\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010,\u001a\u00020\"H\u0017J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u0013H\u0017J\u0010\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u000201H\u0002J\"\u00102\u001a\u00020\"2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\tH\u0014J\u0018\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u000bH\u0016J\u0012\u0010;\u001a\u0004\u0018\u0001062\u0006\u00103\u001a\u000204H\u0014J \u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000206H\u0002J\u0018\u0010A\u001a\u00020\"2\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0007H\u0015J\u001c\u0010D\u001a\u00020\"2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0014J\u0018\u0010E\u001a\u00020\"2\u0006\u0010'\u001a\u00020\t2\u0006\u0010F\u001a\u00020\u0007H\u0014J\u0018\u0010G\u001a\u00020\"2\u0006\u0010'\u001a\u00020\t2\u0006\u0010F\u001a\u00020\tH\u0014J\u0018\u0010H\u001a\u00020\"2\u0006\u0010'\u001a\u00020\t2\u0006\u0010F\u001a\u00020\rH\u0014J\b\u0010I\u001a\u00020\"H\u0017J\u0010\u0010J\u001a\u00020\"2\u0006\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020\"H\u0016J \u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0013H\u0017J\b\u0010Q\u001a\u00020\"H\u0017J\u0018\u0010R\u001a\u00020\"2\u0006\u0010S\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0010\u0010T\u001a\u00020\"2\u0006\u0010U\u001a\u00020\u0007H\u0016J\u0012\u0010V\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010V\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0012\u0010W\u001a\u00020\"2\b\u0010S\u001a\u0004\u0018\u000101H\u0003J\b\u0010X\u001a\u00020\"H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "Lcom/taobao/message/chat/component/chatinput/node/IGrowingTextInput;", "()V", "beforeMeasureAttribute", "Lcom/taobao/android/dinamicx/model/DXLayoutParamAttribute;", "enabledSpan", "", "forceRefreshSign", "", "hasFilterFirstHideEvent", "", "initTxt", "", "isInitTxt", "keyboardHelper", "Lcom/taobao/message/chat/component/chatinput/utils/ChatKeyboardHelper;", "lastRequestShowKeyboardMillis", "mLastSetText", "", Constants.Name.MAX_LENGTH, "maxNumberOfLines", "minNumberOfLines", Constants.Name.PLACE_HOLDER, "placeHolderColor", "text", "textColor", "textGravity", "textSize", "", CartRecommendRefreshScene.build, "obj", "", "considerInitKeyboardHelper", "", "ed", "Lcom/taobao/message/chat/component/chatinput/view/widget/MeasurableEditText;", "createNativeView", "getDefaultValueForIntAttr", "key", "getEditText", "getLineHeight", "getSelection", "getText", "hideSoftInput", "insert", "charSequence", "onBeforeMeasure", "measureUtilView", "Landroid/widget/EditText;", "onBindEvent", "context", "Landroid/content/Context;", "weakView", "Landroid/view/View;", "eventId", "onClone", "widgetNode", "deepClone", "onCreateView", "onDeleteChar", "textInputWidgetNode", "buff", "Landroid/text/Editable;", "view", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRenderView", "onSetIntAttribute", "attr", "onSetLongAttribute", "onSetStringAttribute", "performDeleteClick", "postMyEvent", "event", "Lcom/taobao/message/lab/comfrm/support/dinamic/DxCustemDataEvent;", "postRequestFocus", "replace", "start", "end", "requestFocus", "setNativeTextGravity", "editText", "setSelection", "index", "setText", "setupNativeView", "showSoftInput", "Builder", "Companion", "InputTextWatcher", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class DXGrowingTextInputViewWidgetNode extends DXWidgetNode implements IGrowingTextInput {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    private static final int DEFAULT_TEXT_COLOR = -16777216;
    private static final int DEFAULT_TEXT_SIZE = 0;
    private static final long DXGROWINGTEXTINPUTVIEW_FORCEREFRESHSIGN = -1938128865720576641L;
    public static final long DXGROWINGTEXTINPUTVIEW_GROWINGTEXTINPUTVIEW = -3041950315049099967L;
    private static final long DXGROWINGTEXTINPUTVIEW_INITIALTXT = 605139949298574644L;
    private static final long DXGROWINGTEXTINPUTVIEW_MAXLENGTH = -2628107586387168847L;
    private static final long DXGROWINGTEXTINPUTVIEW_MAXNUMBEROFLINES = 3896760638986517615L;
    private static final long DXGROWINGTEXTINPUTVIEW_MINNUMBEROFLINES = -8335966836964332947L;
    private static final long DXGROWINGTEXTINPUTVIEW_ONCHANGE = 5288679823228297259L;
    private static final long DXGROWINGTEXTINPUTVIEW_ONFOCUSCHANGE = 145138991613514032L;
    private static final long DXGROWINGTEXTINPUTVIEW_ONKEYBOARDHIDEEVENT = -403229045508524899L;
    private static final long DXGROWINGTEXTINPUTVIEW_ONKEYBOARDSHOWEVENT = 3900591102591836612L;
    private static final long DXGROWINGTEXTINPUTVIEW_PLACEHOLDER = 5980555813819279758L;
    private static final long DXGROWINGTEXTINPUTVIEW_PLACEHOLDERCOLOR = 1205272363096125842L;
    private static final long DXGROWINGTEXTINPUTVIEW_SPANCHANGE = -1677729577040704766L;
    private static final long DXGROWINGTEXTINPUTVIEW_SPANENABLED = -490470723614220184L;
    private static final long DXGROWINGTEXTINPUTVIEW_TEXT = 38178040921L;
    private static final long DXGROWINGTEXTINPUTVIEW_TEXTCOLOR = 5737767606580872653L;
    private static final long DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY = -1564827143683948874L;
    private static final int DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_CENTER = 1;
    private static final int DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_LEFT = 0;
    private static final int DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_RIGHT = 2;
    private static final long DXGROWINGTEXTINPUTVIEW_TEXTSIZE = 6751005219504497256L;
    private static final String TAG = "DXGrowingTextInputViewWidgetNode";
    private static volatile MeasurableEditText cacheEditText;
    private static volatile boolean cacheEditTextFinish;
    private int enabledSpan;
    private long forceRefreshSign;
    private boolean hasFilterFirstHideEvent;
    private String initTxt;
    private boolean isInitTxt;
    private ChatKeyboardHelper keyboardHelper;
    private long lastRequestShowKeyboardMillis;
    private CharSequence mLastSetText;
    private int maxLength;
    private int maxNumberOfLines;
    private int minNumberOfLines;
    private String placeHolder;
    private CharSequence text;
    private int textGravity;
    private float textSize;
    private int textColor = -16777216;
    private int placeHolderColor = -7829368;
    private final a beforeMeasureAttribute = new a();

    static {
        kge.a(-1399081937);
        kge.a(-221632619);
        Companion = new Companion(null);
    }

    public static /* synthetic */ Object ipc$super(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ MeasurableEditText access$createNativeView(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MeasurableEditText) ipChange.ipc$dispatch("8d75512e", new Object[]{dXGrowingTextInputViewWidgetNode}) : dXGrowingTextInputViewWidgetNode.createNativeView();
    }

    public static final /* synthetic */ MeasurableEditText access$getCacheEditText$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MeasurableEditText) ipChange.ipc$dispatch("cf13c68c", new Object[0]) : cacheEditText;
    }

    public static final /* synthetic */ boolean access$getCacheEditTextFinish$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52aaa4e6", new Object[0])).booleanValue() : cacheEditTextFinish;
    }

    public static final /* synthetic */ boolean access$isInitTxt$p(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("22c8a40d", new Object[]{dXGrowingTextInputViewWidgetNode})).booleanValue() : dXGrowingTextInputViewWidgetNode.isInitTxt;
    }

    public static final /* synthetic */ boolean access$onDeleteChar(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode2, Editable editable, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6d794a2", new Object[]{dXGrowingTextInputViewWidgetNode, dXGrowingTextInputViewWidgetNode2, editable, view})).booleanValue() : dXGrowingTextInputViewWidgetNode.onDeleteChar(dXGrowingTextInputViewWidgetNode2, editable, view);
    }

    public static final /* synthetic */ void access$postMyEvent(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, DxCustemDataEvent dxCustemDataEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149ce095", new Object[]{dXGrowingTextInputViewWidgetNode, dxCustemDataEvent});
        } else {
            dXGrowingTextInputViewWidgetNode.postMyEvent(dxCustemDataEvent);
        }
    }

    public static final /* synthetic */ void access$setCacheEditText$cp(MeasurableEditText measurableEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e942574c", new Object[]{measurableEditText});
        } else {
            cacheEditText = measurableEditText;
        }
    }

    public static final /* synthetic */ void access$setCacheEditTextFinish$cp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2b5a6", new Object[]{new Boolean(z)});
        } else {
            cacheEditTextFinish = z;
        }
    }

    public static final /* synthetic */ void access$setHasFilterFirstHideEvent$p(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0df6d", new Object[]{dXGrowingTextInputViewWidgetNode, new Boolean(z)});
        } else {
            dXGrowingTextInputViewWidgetNode.hasFilterFirstHideEvent = z;
        }
    }

    public static final /* synthetic */ void access$setInitTxt$p(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2909fe33", new Object[]{dXGrowingTextInputViewWidgetNode, new Boolean(z)});
        } else {
            dXGrowingTextInputViewWidgetNode.isInitTxt = z;
        }
    }

    public static final /* synthetic */ void access$setMaxNumberOfLines$p(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451ab401", new Object[]{dXGrowingTextInputViewWidgetNode, new Integer(i)});
        } else {
            dXGrowingTextInputViewWidgetNode.maxNumberOfLines = i;
        }
    }

    public DXGrowingTextInputViewWidgetNode() {
        if (cacheEditText != null || cacheEditTextFinish) {
            return;
        }
        Schedules.lowBackground(new Runnable() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                DXGrowingTextInputViewWidgetNode.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TraceUtil.beginSection("GrowingTextInput-Preload");
                if (DXGrowingTextInputViewWidgetNode.access$getCacheEditText$cp() == null && DXGrowingTextInputViewWidgetNode.this.getDXRuntimeContext() != null && !DXGrowingTextInputViewWidgetNode.access$getCacheEditTextFinish$cp()) {
                    DXGrowingTextInputViewWidgetNode.access$setCacheEditText$cp(DXGrowingTextInputViewWidgetNode.access$createNativeView(DXGrowingTextInputViewWidgetNode.this));
                }
                DXGrowingTextInputViewWidgetNode.access$setCacheEditTextFinish$cp(true);
                TraceUtil.endTrace();
            }
        });
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode$Companion;", "", "()V", "DEFAULT_TEXT_COLOR", "", "DEFAULT_TEXT_SIZE", "DXGROWINGTEXTINPUTVIEW_FORCEREFRESHSIGN", "", "DXGROWINGTEXTINPUTVIEW_GROWINGTEXTINPUTVIEW", "DXGROWINGTEXTINPUTVIEW_INITIALTXT", "DXGROWINGTEXTINPUTVIEW_MAXLENGTH", "DXGROWINGTEXTINPUTVIEW_MAXNUMBEROFLINES", "DXGROWINGTEXTINPUTVIEW_MINNUMBEROFLINES", "DXGROWINGTEXTINPUTVIEW_ONCHANGE", "DXGROWINGTEXTINPUTVIEW_ONFOCUSCHANGE", "DXGROWINGTEXTINPUTVIEW_ONKEYBOARDHIDEEVENT", "DXGROWINGTEXTINPUTVIEW_ONKEYBOARDSHOWEVENT", "DXGROWINGTEXTINPUTVIEW_PLACEHOLDER", "DXGROWINGTEXTINPUTVIEW_PLACEHOLDERCOLOR", "DXGROWINGTEXTINPUTVIEW_SPANCHANGE", "DXGROWINGTEXTINPUTVIEW_SPANENABLED", "DXGROWINGTEXTINPUTVIEW_TEXT", "DXGROWINGTEXTINPUTVIEW_TEXTCOLOR", "DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY", "DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_CENTER", "DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_LEFT", "DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_RIGHT", "DXGROWINGTEXTINPUTVIEW_TEXTSIZE", RPCDataItems.SWITCH_TAG_LOG, "", "cacheEditText", "Lcom/taobao/message/chat/component/chatinput/view/widget/MeasurableEditText;", "cacheEditTextFinish", "", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Companion {
        static {
            kge.a(-2011729737);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode$Builder;", "Lcom/taobao/android/dinamicx/widget/IDXBuilderWidgetNode;", "()V", CartRecommendRefreshScene.build, "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "obj", "", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Builder implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1155460102);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXGrowingTextInputViewWidgetNode();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXGrowingTextInputViewWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode widgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, widgetNode, new Boolean(z)});
            return;
        }
        q.c(widgetNode, "widgetNode");
        DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode = (DXGrowingTextInputViewWidgetNode) (!(widgetNode instanceof DXGrowingTextInputViewWidgetNode) ? null : widgetNode);
        if (dXGrowingTextInputViewWidgetNode == null) {
            return;
        }
        super.onClone(widgetNode, z);
        this.maxNumberOfLines = dXGrowingTextInputViewWidgetNode.maxNumberOfLines;
        this.minNumberOfLines = dXGrowingTextInputViewWidgetNode.minNumberOfLines;
        this.mLastSetText = dXGrowingTextInputViewWidgetNode.mLastSetText;
        this.forceRefreshSign = dXGrowingTextInputViewWidgetNode.forceRefreshSign;
        this.hasFilterFirstHideEvent = dXGrowingTextInputViewWidgetNode.hasFilterFirstHideEvent;
        this.text = dXGrowingTextInputViewWidgetNode.text;
        this.textColor = dXGrowingTextInputViewWidgetNode.textColor;
        this.textSize = dXGrowingTextInputViewWidgetNode.textSize;
        this.textGravity = dXGrowingTextInputViewWidgetNode.textGravity;
        this.placeHolder = dXGrowingTextInputViewWidgetNode.placeHolder;
        this.maxLength = dXGrowingTextInputViewWidgetNode.maxLength;
        this.placeHolderColor = dXGrowingTextInputViewWidgetNode.placeHolderColor;
        this.initTxt = dXGrowingTextInputViewWidgetNode.initTxt;
        this.enabledSpan = dXGrowingTextInputViewWidgetNode.enabledSpan;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 5737767606580872653L) {
            return -16777216;
        }
        if (j != 6751005219504497256L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), attr});
            return;
        }
        q.c(attr, "attr");
        if (j == DXGROWINGTEXTINPUTVIEW_INITIALTXT) {
            this.initTxt = attr;
        } else if (j == 38178040921L) {
            this.text = attr;
        } else if (j == 5980555813819279758L) {
            this.placeHolder = attr;
        } else {
            super.onSetStringAttribute(j, attr);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXGROWINGTEXTINPUTVIEW_MAXNUMBEROFLINES) {
            this.maxNumberOfLines = i;
        } else if (j == DXGROWINGTEXTINPUTVIEW_MINNUMBEROFLINES) {
            this.minNumberOfLines = i;
        } else if (j == 5737767606580872653L) {
            this.textColor = i;
        } else if (j == -1564827143683948874L) {
            this.textGravity = i;
        } else if (j == -2628107586387168847L) {
            this.maxLength = i;
        } else if (j == 1205272363096125842L) {
            this.placeHolderColor = i;
        } else if (j == DXGROWINGTEXTINPUTVIEW_SPANENABLED) {
            this.enabledSpan = i;
        } else if (j == 6751005219504497256L) {
            this.textSize = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXGROWINGTEXTINPUTVIEW_FORCEREFRESHSIGN) {
            this.forceRefreshSign = j2;
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, final View weakView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, weakView, new Long(j)});
            return;
        }
        q.c(weakView, "weakView");
        if (j != 5288679823228297259L) {
            if (j == DXGROWINGTEXTINPUTVIEW_SPANCHANGE) {
                if (this.enabledSpan != 1) {
                    return;
                }
                ((EditText) weakView).setOnKeyListener(new View.OnKeyListener() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$onBindEvent$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i, KeyEvent event) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), event})).booleanValue();
                        }
                        if (i == 67) {
                            q.a((Object) event, "event");
                            if (event.getAction() == 0) {
                                DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode = DXGrowingTextInputViewWidgetNode.this;
                                Editable editableText = ((EditText) weakView).getEditableText();
                                q.a((Object) editableText, "weakView.editableText");
                                return DXGrowingTextInputViewWidgetNode.access$onDeleteChar(dXGrowingTextInputViewWidgetNode, dXGrowingTextInputViewWidgetNode, editableText, weakView);
                            }
                        }
                        return false;
                    }
                });
                return;
            }
            super.onBindEvent(context, weakView, j);
            return;
        }
        Object tag = weakView.getTag(j.TEXT_WATCHER);
        if (!(tag instanceof InputTextWatcher)) {
            tag = null;
        }
        InputTextWatcher inputTextWatcher = (InputTextWatcher) tag;
        if (inputTextWatcher != null) {
            ((EditText) weakView).removeTextChangedListener(inputTextWatcher);
        }
        InputTextWatcher inputTextWatcher2 = new InputTextWatcher(this, weakView);
        weakView.setTag(j.TEXT_WATCHER, inputTextWatcher2);
        ((EditText) weakView).addTextChangedListener(inputTextWatcher2);
    }

    private final void setNativeTextGravity(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5866a2f3", new Object[]{this, editText, new Integer(i)});
        } else if (i == 0) {
            editText.setGravity(19);
        } else if (i == 1) {
            editText.setGravity(17);
        } else if (i == 2) {
            editText.setGravity(21);
        } else {
            editText.setGravity(16);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J*\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode$InputTextWatcher;", "Landroid/text/TextWatcher;", "textInputWidgetNode", "Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode;", "view", "Landroid/view/View;", "(Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode;Landroid/view/View;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", JarvisConstant.TRIGGER_POINT_AFTER, "onTextChanged", "before", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class InputTextWatcher implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final DXGrowingTextInputViewWidgetNode textInputWidgetNode;
        private final View view;

        static {
            kge.a(1898817946);
            kge.a(1670231405);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        public InputTextWatcher(DXGrowingTextInputViewWidgetNode textInputWidgetNode, View view) {
            q.c(textInputWidgetNode, "textInputWidgetNode");
            q.c(view, "view");
            this.textInputWidgetNode = textInputWidgetNode;
            this.view = view;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            View view = this.view;
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.EditText");
            }
            Editable text = ((EditText) view).getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            DxCustemDataEvent dxCustemDataEvent = new DxCustemDataEvent(5288679823228297259L);
            dxCustemDataEvent.put("text", str);
            dxCustemDataEvent.put("txtChangeStart", Integer.valueOf(i));
            dxCustemDataEvent.put("txtChangeBefore", Integer.valueOf(i2));
            dxCustemDataEvent.put("txtChangeCount", Integer.valueOf(i3));
            dxCustemDataEvent.put("isInitTxt", Boolean.valueOf(DXGrowingTextInputViewWidgetNode.access$isInitTxt$p(this.textInputWidgetNode)));
            this.textInputWidgetNode.postEvent(dxCustemDataEvent);
            DXGrowingTextInputViewWidgetNode.access$setInitTxt$p(this.textInputWidgetNode, false);
        }
    }

    private final void considerInitKeyboardHelper(MeasurableEditText measurableEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724da50", new Object[]{this, measurableEditText});
            return;
        }
        DXRuntimeContext dxRuntimeContext = getDXRuntimeContext();
        q.a((Object) dxRuntimeContext, "dxRuntimeContext");
        ba b = dxRuntimeContext.b();
        if (!(b instanceof DXWidgetInstance.MPUserContext)) {
            b = null;
        }
        DXWidgetInstance.MPUserContext mPUserContext = (DXWidgetInstance.MPUserContext) b;
        if (mPUserContext == null) {
            return;
        }
        Disposable disposable = mPUserContext.getDisposable(ChatKeyboardHelper.TAG);
        if (!(disposable instanceof ChatKeyboardHelper)) {
            disposable = null;
        }
        ChatKeyboardHelper chatKeyboardHelper = (ChatKeyboardHelper) disposable;
        if (chatKeyboardHelper != null) {
            this.keyboardHelper = chatKeyboardHelper;
            return;
        }
        DXRuntimeContext dxRuntimeContext2 = getDXRuntimeContext();
        q.a((Object) dxRuntimeContext2, "dxRuntimeContext");
        DXRootView s = dxRuntimeContext2.s();
        Context context = s != null ? s.getContext() : null;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            return;
        }
        ChatKeyboardHelper chatKeyboardHelper2 = new ChatKeyboardHelper(activity, measurableEditText);
        chatKeyboardHelper2.setKeyboardWillShowOrHide(new DXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$$inlined$apply$lambda$1(chatKeyboardHelper2, this));
        this.keyboardHelper = chatKeyboardHelper2;
        mPUserContext.addDisposable(ChatKeyboardHelper.TAG, this.keyboardHelper);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        q.c(context, "context");
        final MeasurableEditText editText = getEditText();
        TraceUtil.beginSection("GrowingTextInput-considerInitKeyboardHelper");
        considerInitKeyboardHelper(editText);
        TraceUtil.endTrace();
        editText.addTextChangedListener(new TextWatcher() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$onCreateView$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int mLastLine = 1;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                    return;
                }
                DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode = DXGrowingTextInputViewWidgetNode.this;
                if (DXGrowingTextInputViewWidgetNode.$ipChange <= 0 || this.mLastLine == editText.getLineCount() || editText.getLineCount() <= 0) {
                    return;
                }
                int lineCount = editText.getLineCount();
                DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode2 = DXGrowingTextInputViewWidgetNode.this;
                if (lineCount > DXGrowingTextInputViewWidgetNode.$ipChange) {
                    return;
                }
                this.mLastLine = editText.getLineCount();
                Object tag = editText.getTag(DXWidgetNode.TAG_WIDGET_NODE);
                DXRuntimeContext dXRuntimeContext = null;
                if (!(tag instanceof DXWidgetNode)) {
                    tag = null;
                }
                DXWidgetNode dXWidgetNode = (DXWidgetNode) tag;
                if (dXWidgetNode != null) {
                    dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
                }
                if (dXRuntimeContext != null) {
                    DXWidgetNode referenceNode = dXWidgetNode.getReferenceNode();
                    if (referenceNode != null) {
                        referenceNode.requestLayout();
                        return;
                    }
                    DXRuntimeContext dXRuntimeContext2 = DXGrowingTextInputViewWidgetNode.this.getDXRuntimeContext();
                    q.a((Object) dXRuntimeContext2, "this@DXGrowingTextInputV…dgetNode.dxRuntimeContext");
                    dXRuntimeContext2.d().requestLayout();
                    return;
                }
                DXRuntimeContext dXRuntimeContext3 = DXGrowingTextInputViewWidgetNode.this.getDXRuntimeContext();
                q.a((Object) dXRuntimeContext3, "this@DXGrowingTextInputV…dgetNode.dxRuntimeContext");
                dXRuntimeContext3.d().requestLayout();
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$onCreateView$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    return;
                }
                if (z) {
                    DXGrowingTextInputViewWidgetNode.this.showSoftInput();
                }
                DxCustemDataEvent dxCustemDataEvent = new DxCustemDataEvent(145138991613514032L);
                dxCustemDataEvent.put(Constants.Event.FOCUS, Boolean.valueOf(z));
                DXGrowingTextInputViewWidgetNode.access$postMyEvent(DXGrowingTextInputViewWidgetNode.this, dxCustemDataEvent);
            }
        });
        if (this.enabledSpan == 1) {
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$onCreateView$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent event) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), event})).booleanValue();
                    }
                    if (i == 67) {
                        q.a((Object) event, "event");
                        if (event.getAction() == 0) {
                            DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode = DXGrowingTextInputViewWidgetNode.this;
                            Editable editableText = editText.getEditableText();
                            q.a((Object) editableText, "ed.editableText");
                            DXGrowingTextInputViewWidgetNode.access$onDeleteChar(dXGrowingTextInputViewWidgetNode, dXGrowingTextInputViewWidgetNode, editableText, editText);
                        }
                    }
                    return false;
                }
            });
        }
        return editText;
    }

    private final boolean onDeleteChar(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, Editable editable, View view) {
        boolean z;
        DxCustemDataEvent dxCustemDataEvent;
        DxCustemDataEvent dxCustemDataEvent2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a519c9a6", new Object[]{this, dXGrowingTextInputViewWidgetNode, editable, view})).booleanValue();
        }
        try {
            int selectionStart = Selection.getSelectionStart(editable);
            if (selectionStart == Selection.getSelectionEnd(editable) && selectionStart > 0) {
                if (Character.isWhitespace(editable.charAt(selectionStart - 1))) {
                    selectionStart--;
                    z = true;
                } else {
                    z = false;
                }
                AtSpan[] linkSpans = (AtSpan[]) editable.getSpans(selectionStart, selectionStart, AtSpan.class);
                if (linkSpans.length > 0) {
                    q.a((Object) linkSpans, "linkSpans");
                    int length = linkSpans.length;
                    for (int i = 0; i < length; i++) {
                        if (selectionStart == editable.getSpanStart(linkSpans[i])) {
                            return false;
                        }
                        if (z) {
                            editable.replace(editable.getSpanStart(linkSpans[i]), editable.getSpanEnd(linkSpans[i]) + 1, "");
                        } else {
                            editable.replace(editable.getSpanStart(linkSpans[i]), editable.getSpanEnd(linkSpans[i]), "");
                        }
                        editable.removeSpan(linkSpans[i]);
                        try {
                            dxCustemDataEvent = new DxCustemDataEvent(DXGROWINGTEXTINPUTVIEW_SPANCHANGE);
                            AtSpan atSpan = linkSpans[i];
                            q.a((Object) atSpan, "linkSpans[i]");
                            String targetId = atSpan.getTargetId();
                            q.a((Object) targetId, "linkSpans[i].targetId");
                            dxCustemDataEvent.put("targetId", targetId);
                            AtSpan atSpan2 = linkSpans[i];
                            q.a((Object) atSpan2, "linkSpans[i]");
                            String nick = atSpan2.getNick();
                            q.a((Object) nick, "linkSpans[i].nick");
                            dxCustemDataEvent.put("nickName", nick);
                            dXGrowingTextInputViewWidgetNode.postEvent(dxCustemDataEvent);
                            dxCustemDataEvent2 = new DxCustemDataEvent(5288679823228297259L);
                        } catch (Throwable unused) {
                        }
                        if (view != null) {
                            Editable text = ((EditText) view).getText();
                            if (text == null || (str = text.toString()) == null) {
                                str = "";
                            }
                            dxCustemDataEvent2.put("text", str);
                            dXGrowingTextInputViewWidgetNode.postEvent(dxCustemDataEvent);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.EditText");
                            break;
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private final void postMyEvent(DxCustemDataEvent dxCustemDataEvent) {
        DXWidgetNode flattenWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b477d", new Object[]{this, dxCustemDataEvent});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        q.a((Object) dXRuntimeContext, "this@DXGrowingTextInputV…dgetNode.dxRuntimeContext");
        DXRootView s = dXRuntimeContext.s();
        DXWidgetNode queryWTByUserId = (s == null || (flattenWidgetNode = s.getFlattenWidgetNode()) == null) ? null : flattenWidgetNode.queryWTByUserId(getUserId());
        if (queryWTByUserId != null) {
            queryWTByUserId.postEvent(dxCustemDataEvent);
        } else {
            postEvent(dxCustemDataEvent);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (!(view instanceof EditText)) {
            view = null;
        }
        EditText editText = (EditText) view;
        if (editText == null) {
            return;
        }
        ViewParent parent = editText.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.setFocusableInTouchMode(true);
        }
        if (!(!q.a(this.text, this.mLastSetText))) {
            return;
        }
        CharSequence charSequence = this.text;
        this.mLastSetText = charSequence;
        editText.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0056, code lost:
        if ((r5.s().findViewById(com.taobao.taobao.R.id.mp_chat_input_id) instanceof com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText) == false) goto L14;
     */
    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            r1[r2] = r3
            r9 = 2
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r10)
            r1[r9] = r2
            java.lang.String r9 = "26cb6a66"
            r0.ipc$dispatch(r9, r1)
            return
        L22:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            int r4 = android.view.View.MeasureSpec.getMode(r10)
            int r5 = android.view.View.MeasureSpec.getSize(r10)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r0 != r6) goto L59
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r7) goto L59
            int r7 = r8.getMinHeight()
            if (r5 < r7) goto L59
            com.taobao.android.dinamicx.DXRuntimeContext r5 = r8.getDXRuntimeContext()
            java.lang.String r7 = "this.dxRuntimeContext"
            kotlin.jvm.internal.q.a(r5, r7)
            com.taobao.android.dinamicx.DXRootView r5 = r5.s()
            int r7 = com.taobao.taobao.R.id.mp_chat_input_id
            android.view.View r5 = r5.findViewById(r7)
            boolean r5 = r5 instanceof com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText
            if (r5 != 0) goto L59
            goto L5a
        L59:
            r2 = 0
        L5a:
            if (r2 == 0) goto L64
            int r9 = r8.getMinHeight()
            r8.setMeasuredDimension(r1, r9)
            return
        L64:
            if (r0 != r6) goto L6c
            if (r4 != r6) goto L6c
            r8.setMeasuredDimension(r9, r10)
            return
        L6c:
            com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText r0 = r8.getEditText()
            r1 = r0
            android.widget.EditText r1 = (android.widget.EditText) r1
            r8.onBeforeMeasure(r1)
            r0.onMeasure(r9, r10)
            int r9 = r0.getMeasuredHeightAndState()
            int r10 = r8.getMinHeight()
            if (r9 <= r10) goto L88
            int r9 = r0.getMeasuredHeightAndState()
            goto L8c
        L88:
            int r9 = r8.getMinHeight()
        L8c:
            int r10 = r0.getMeasuredWidthAndState()
            r8.setMeasuredDimension(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode.onMeasure(int, int):void");
    }

    private final MeasurableEditText createNativeView() {
        MeasurableEditText measurableEditText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasurableEditText) ipChange.ipc$dispatch("f01b3502", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            DXRuntimeContext dxRuntimeContext = getDXRuntimeContext();
            q.a((Object) dxRuntimeContext, "dxRuntimeContext");
            measurableEditText = new MeasurableEditText(dxRuntimeContext.m());
            measurableEditText.setCursorVisible(true);
            measurableEditText.setTextColor((int) 4281545523L);
            measurableEditText.setHintTextColor((int) 4288256409L);
            measurableEditText.setTextCursorDrawable(R.drawable.shape_edittext_cursor);
        } else {
            DXRuntimeContext dxRuntimeContext2 = getDXRuntimeContext();
            q.a((Object) dxRuntimeContext2, "dxRuntimeContext");
            View inflate = LayoutInflater.from(dxRuntimeContext2.m()).inflate(R.layout.msg_growing_text_input, (ViewGroup) null);
            if (inflate == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText");
            }
            measurableEditText = (MeasurableEditText) inflate;
        }
        measurableEditText.setId(R.id.mp_chat_input_id);
        measurableEditText.setBackground(null);
        return measurableEditText;
    }

    private final void setupNativeView(EditText editText) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4607017f", new Object[]{this, editText});
        } else if (editText == null) {
        } else {
            editText.setHint(this.placeHolder);
            editText.setHintTextColor(tryFetchDarkModeColor(Constants.Name.PLACEHOLDER_COLOR, 0, this.placeHolderColor));
            editText.setTextSize(0, this.textSize);
            editText.setTextColor(tryFetchDarkModeColor("textColor", 0, this.textColor));
            setNativeTextGravity(editText, this.textGravity);
            editText.setOnTouchListener(DXGrowingTextInputViewWidgetNode$setupNativeView$1.INSTANCE);
            int i = this.maxLength;
            if (i <= 0) {
                editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
            } else {
                editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
            }
            if (this.maxNumberOfLines > 0) {
                editText.setInputType(editText.getInputType() | 131072);
                editText.setSingleLine(this.maxNumberOfLines == 1);
                editText.setMaxLines(this.maxNumberOfLines);
                editText.setPadding(0, DisplayUtil.dip2px(DinamicXEngine.i(), 2.0f), 0, DisplayUtil.dip2px(DinamicXEngine.i(), 2.0f));
            }
            int i2 = this.minNumberOfLines;
            if (i2 > 0) {
                editText.setMinLines(i2);
            }
            String str = this.initTxt;
            if (str == null) {
                return;
            }
            if (str.length() <= 0) {
                z = false;
            }
            if (!z) {
                str = null;
            }
            if (str == null) {
                return;
            }
            editText.setText(str);
        }
    }

    private final void onBeforeMeasure(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a1758", new Object[]{this, editText});
            return;
        }
        this.beforeMeasureAttribute.f11888a = getLayoutWidth();
        this.beforeMeasureAttribute.b = getLayoutHeight();
        this.beforeMeasureAttribute.c = getWeight();
        if (getLayoutGravity() != this.beforeMeasureAttribute.e) {
            this.beforeMeasureAttribute.d = gbh.a(DXWidgetNode.getAbsoluteGravity(getLayoutGravity(), getDirection()));
            this.beforeMeasureAttribute.e = getLayoutGravity();
        }
        DXWidgetNode parentWidget = getParentWidget();
        ViewGroup.LayoutParams layoutParams = null;
        if (!(parentWidget instanceof m)) {
            parentWidget = null;
        }
        m mVar = (m) parentWidget;
        ViewGroup.LayoutParams layoutParams2 = editText.getLayoutParams();
        if (layoutParams2 == null) {
            if (mVar != null) {
                layoutParams = mVar.generateLayoutParams(this.beforeMeasureAttribute);
            }
        } else if (mVar != null) {
            layoutParams = mVar.generateLayoutParams(this.beforeMeasureAttribute, layoutParams2);
        }
        editText.setLayoutParams(layoutParams);
    }

    private final MeasurableEditText getEditText() {
        MeasurableEditText createNativeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasurableEditText) ipChange.ipc$dispatch("af9f060d", new Object[]{this});
        }
        TraceUtil.beginSection("GrowingTextInput-getEditText");
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        q.a((Object) dXRuntimeContext, "this.dxRuntimeContext");
        View findViewById = dXRuntimeContext.s().findViewById(R.id.mp_chat_input_id);
        if (findViewById instanceof MeasurableEditText) {
            createNativeView = (MeasurableEditText) findViewById;
            createNativeView.setPasteCallback(new MeasurableEditText.IPasteCallback() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$getEditText$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText.IPasteCallback
                public final void onPaste(CharSequence charSequence, CharSequence charSequence2) {
                    String str;
                    String obj;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dfae79c3", new Object[]{this, charSequence, charSequence2});
                        return;
                    }
                    DxCustemDataEvent dxCustemDataEvent = new DxCustemDataEvent(5288679823228297259L);
                    if (charSequence == null || (obj = charSequence.toString()) == null || (str = URLEncoder.encode(obj, "UTF-8")) == null) {
                        str = "";
                    }
                    dxCustemDataEvent.put("text", str);
                    dxCustemDataEvent.put("action", "paste");
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    dxCustemDataEvent.put("label", charSequence2);
                    DXGrowingTextInputViewWidgetNode.this.postEvent(dxCustemDataEvent);
                }
            });
        } else {
            if (cacheEditText != null) {
                TraceUtil.beginSection("GrowingTextInput-cacheEditText");
                createNativeView = cacheEditText;
                if (createNativeView == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText");
                }
                cacheEditText = null;
                TraceUtil.endTrace();
            } else {
                TraceUtil.beginSection("GrowingTextInput-createNativeView");
                createNativeView = createNativeView();
                TraceUtil.endTrace();
            }
            TraceUtil.beginSection("GrowingTextInput-setupNativeView");
            setupNativeView(createNativeView);
            TraceUtil.endTrace();
        }
        TraceUtil.endTrace();
        return createNativeView;
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void showSoftInput() {
        Context m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd2fa4a", new Object[]{this});
        } else if (System.currentTimeMillis() - this.lastRequestShowKeyboardMillis < 600) {
        } else {
            this.lastRequestShowKeyboardMillis = System.currentTimeMillis();
            MeasurableEditText editText = getEditText();
            editText.requestFocus();
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext == null || (m = dXRuntimeContext.m()) == null) {
                return;
            }
            Activity activity = (Activity) (!(m instanceof Activity) ? null : m);
            if (activity == null) {
                return;
            }
            if (!(true ^ activity.isFinishing())) {
                activity = null;
            }
            if (activity == null) {
                return;
            }
            Object systemService = m.getSystemService("input_method");
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager == null) {
                return;
            }
            inputMethodManager.showSoftInput(editText, 0);
            activity.getWindow().setSoftInputMode(18);
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void hideSoftInput() {
        Context m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c129025", new Object[]{this});
            return;
        }
        TLog.loge(TAG, "hideSoftInput");
        MeasurableEditText editText = getEditText();
        editText.clearFocus();
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        Activity activity = null;
        Object systemService = (dXRuntimeContext == null || (m = dXRuntimeContext.m()) == null) ? null : m.getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager)) {
            systemService = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager == null) {
            return;
        }
        DXRuntimeContext dXRuntimeContext2 = getDXRuntimeContext();
        Context m2 = dXRuntimeContext2 != null ? dXRuntimeContext2.m() : null;
        if (m2 instanceof Activity) {
            activity = m2;
        }
        Activity activity2 = activity;
        if (activity2 == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        activity2.getWindow().setSoftInputMode(34);
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void performDeleteClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad01303", new Object[]{this});
        } else {
            getEditText().onKeyDown(67, new KeyEvent(0, 67));
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void insert(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539fe764", new Object[]{this, charSequence});
            return;
        }
        q.c(charSequence, "charSequence");
        MeasurableEditText editText = getEditText();
        int selectionStart = editText.getSelectionStart();
        if (selectionStart == -1) {
            return;
        }
        if (this.maxLength > 0 && editText.getEditableText().length() + charSequence.length() > this.maxLength) {
            return;
        }
        editText.getEditableText().insert(selectionStart, charSequence);
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public int getLineHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e80b222b", new Object[]{this})).intValue() : getEditText().getLineHeight();
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void setText(CharSequence charSequence, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7491ba", new Object[]{this, charSequence, new Boolean(z)});
        } else if (ApplicationUtil.isDebug() && (!q.a(Looper.getMainLooper(), Looper.myLooper()))) {
            throw new RuntimeException("must running in main thread!!");
        } else {
            Boolean bool = (Boolean) getEditText().getTag(R.id.mp_chat_growing_text_init_finish);
            if (z && bool != null) {
                return;
            }
            if (z) {
                getEditText().setTag(R.id.mp_chat_growing_text_init_finish, true);
            }
            this.isInitTxt = z;
            getEditText().setText(charSequence);
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
        } else if (ApplicationUtil.isDebug() && (!q.a(Looper.getMainLooper(), Looper.myLooper()))) {
            throw new RuntimeException("must running in main thread!!");
        } else {
            setText(charSequence, false);
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this}) : getEditText().getText();
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void setSelection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f65a52", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            getEditText().setSelection(i);
        } catch (Throwable th) {
            TLog.loge(TAG, "setSelectionError:" + th.getMessage());
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
        } else {
            getEditText().requestFocus();
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void postRequestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ccde850", new Object[]{this});
            return;
        }
        final MeasurableEditText editText = getEditText();
        editText.post(new Runnable() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$postRequestFocus$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MeasurableEditText.this.requestFocus();
                }
            }
        });
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void replace(int i, int i2, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18717e7f", new Object[]{this, new Integer(i), new Integer(i2), charSequence});
            return;
        }
        q.c(charSequence, "charSequence");
        MeasurableEditText editText = getEditText();
        if (i == -1 || i2 == -1) {
            return;
        }
        if (this.maxLength > 0 && editText.getEditableText().length() + charSequence.length() > this.maxLength) {
            return;
        }
        editText.getEditableText().replace(i, i2, charSequence);
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public int getSelection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb420c50", new Object[]{this})).intValue() : getEditText().getSelectionStart();
    }
}
