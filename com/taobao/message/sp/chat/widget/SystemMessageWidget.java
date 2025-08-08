package com.taobao.message.sp.chat.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.datasdk.facade.message.newmsgbody.ActivePart;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.render.RenderError;
import com.taobao.message.lab.comfrm.render.RenderResult;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.uikit.text.style.EllipsizeLineSpan;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class SystemMessageWidget extends WidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SystemMessageWidget";
    private View itemView;
    private RenderResult mRenderResult;
    private TextView tvContent;

    static {
        kge.a(1666841009);
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        this.itemView = LayoutInflater.from(context).inflate(R.layout.mp_chat_item_msg_system, (ViewGroup) null, false);
        this.tvContent = (TextView) this.itemView.findViewById(R.id.tv_chat_msg_sys);
        return this.itemView;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void bindData(JSONObject jSONObject, final EventDispatcher eventDispatcher) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185178e", new Object[]{this, jSONObject, eventDispatcher});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("content");
            String trim = StringUtils.isEmpty(string) ? "" : string.trim();
            try {
                SpannableString spannableString = new SpannableString(trim);
                List<ActivePart> list = null;
                if (!StringUtils.isEmpty(jSONObject.getString("activeContent"))) {
                    try {
                        list = JSON.parseArray(jSONObject.getString("activeContent"), ActivePart.class);
                    } catch (Exception unused) {
                        TLog.loge(TAG, "activeContent数据格式不对:" + jSONObject.getString("activeContent"));
                    }
                    if (list != null && list.size() > 0) {
                        for (final ActivePart activePart : list) {
                            if (activePart.index >= 0) {
                                int i = activePart.index;
                                if (i >= spannableString.length()) {
                                    TLog.loge(TAG, "start overflow; startIndex=" + i + " | length=" + spannableString.length());
                                } else {
                                    int i2 = activePart.index + activePart.length;
                                    if (i2 > spannableString.length()) {
                                        TLog.loge(TAG, "end overflow; endIndex=" + i2 + " | length=" + spannableString.length());
                                        i2 = spannableString.length();
                                    }
                                    spannableString.setSpan(new EllipsizeLineSpan(activePart.color), i, i2, 17);
                                    spannableString.setSpan(new ClickableSpan() { // from class: com.taobao.message.sp.chat.widget.SystemMessageWidget.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                                            if (str.hashCode() == -1038128277) {
                                                super.updateDrawState((TextPaint) objArr[0]);
                                                return null;
                                            }
                                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                                        }

                                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                        public void updateDrawState(TextPaint textPaint) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                                                return;
                                            }
                                            super.updateDrawState(textPaint);
                                            try {
                                                textPaint.setColor(Color.parseColor("#ff5f00"));
                                            } catch (Throwable th) {
                                                TLog.loge(SystemMessageWidget.TAG, Log.getStackTraceString(th));
                                            }
                                            textPaint.setUnderlineText(false);
                                        }

                                        @Override // android.text.style.ClickableSpan
                                        public void onClick(View view) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                                return;
                                            }
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("content", activePart);
                                            hashMap.put("type", 4);
                                            eventDispatcher.dispatch(new Event.Build("click").data(hashMap).build());
                                        }
                                    }, i, i2, 17);
                                }
                            }
                        }
                    }
                    this.tvContent.setVisibility(0);
                    this.tvContent.setText(spannableString);
                    this.tvContent.setMovementMethod(LinkMovementMethod.getInstance());
                }
                if (!StringUtils.isEmpty(jSONObject.getString("templateContent"))) {
                    try {
                        map = (Map) JSON.parseObject(jSONObject.getString("templateContent"), new TypeReference<Map<String, String>>() { // from class: com.taobao.message.sp.chat.widget.SystemMessageWidget.2
                        }, new Feature[0]);
                    } catch (Exception unused2) {
                        TLog.loge(TAG, "templateContent数据格式不对:" + jSONObject.getString("templateContent"));
                        map = null;
                    }
                    if (map != null) {
                        for (final Map.Entry entry : map.entrySet()) {
                            int indexOf = trim.indexOf((String) entry.getKey());
                            if (indexOf >= 0) {
                                spannableString.setSpan(new EllipsizeLineSpan(EllipsizeLineSpan.DEFAULT_COLOR_INT), indexOf, ((String) entry.getKey()).length() + indexOf, 17);
                                spannableString.setSpan(new ClickableSpan() { // from class: com.taobao.message.sp.chat.widget.SystemMessageWidget.3
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                                        if (str.hashCode() == -1038128277) {
                                            super.updateDrawState((TextPaint) objArr[0]);
                                            return null;
                                        }
                                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public void updateDrawState(TextPaint textPaint) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                                            return;
                                        }
                                        super.updateDrawState(textPaint);
                                        try {
                                            textPaint.setColor(Color.parseColor("#ff5f00"));
                                        } catch (Throwable th) {
                                            TLog.loge(SystemMessageWidget.TAG, Log.getStackTraceString(th));
                                        }
                                        textPaint.setUnderlineText(false);
                                    }

                                    @Override // android.text.style.ClickableSpan
                                    public void onClick(View view) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                            return;
                                        }
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("content", entry.getValue());
                                        hashMap.put("type", 3);
                                        eventDispatcher.dispatch(new Event.Build("click").data(hashMap).build());
                                    }
                                }, indexOf, ((String) entry.getKey()).length() + indexOf, 17);
                            }
                        }
                    }
                }
                this.tvContent.setVisibility(0);
                this.tvContent.setText(spannableString);
                this.tvContent.setMovementMethod(LinkMovementMethod.getInstance());
            } catch (Exception e) {
                this.mRenderResult = new RenderResult(new RenderError("102", "解析异常", e.getLocalizedMessage()));
                if (ApplicationUtil.isDebug()) {
                    throw e;
                }
                TLog.loge(TAG, e.getMessage());
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public RenderResult getRenderResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderResult) ipChange.ipc$dispatch("26051047", new Object[]{this}) : this.mRenderResult;
    }
}
