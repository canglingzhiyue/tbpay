package kotlin.text;

import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.common.util.k;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import tb.rwb;
import tb.rwf;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\n\u001a\u0018\u0010\u0017\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a:\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001aE\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b!\u001a:\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010#\u001a\u00020\u0010*\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u001aD\u0010%\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010*\u001aD\u0010+\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010*\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a;\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b.\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u00100\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u00100\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\n\u00103\u001a\u00020\u0010*\u00020\u0002\u001a\r\u00104\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00105\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00106\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a \u00107\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00108\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00109\u001a\u00020:*\u00020\u0002H\u0086\u0002\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010<\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u0010<\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0>*\u00020\u0002\u001a\u0010\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0@*\u00020\u0002\u001a\u0015\u0010A\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\f\u001a\u000f\u0010B\u001a\u00020\r*\u0004\u0018\u00010\rH\u0087\b\u001a\u001c\u0010C\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020\u0014\u001a\u001c\u0010C\u001a\u00020\r*\u00020\r2\u0006\u0010D\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020\u0014\u001a\u001c\u0010F\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020\u0014\u001a\u001c\u0010F\u001a\u00020\r*\u00020\r2\u0006\u0010D\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020\u0014\u001aG\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00010>*\u00020\u00022\u000e\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0I2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010K\u001a=\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00010>*\u00020\u00022\u0006\u0010H\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bJ\u001a4\u0010L\u001a\u00020\u0010*\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0012\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010P\u001a\u00020\u0002\u001a\u0012\u0010O\u001a\u00020\r*\u00020\r2\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010Q\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006\u001a\u0012\u0010Q\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u0001\u001a\u001d\u0010Q\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010Q\u001a\u00020\r*\u00020\r2\u0006\u0010R\u001a\u00020\u0001H\u0087\b\u001a\u0012\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010T\u001a\u00020\u0002*\u00020\u00022\u0006\u0010U\u001a\u00020\u0002\u001a\u001a\u0010T\u001a\u00020\u0002*\u00020\u00022\u0006\u0010P\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010T\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u0002\u001a\u001a\u0010T\u001a\u00020\r*\u00020\r2\u0006\u0010P\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a.\u0010V\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\b\u0010W\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00020XH\u0087\bø\u0001\u0000\u001a\u001d\u0010V\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020\rH\u0087\b\u001a$\u0010[\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010[\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010_\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010_\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001d\u0010`\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020\rH\u0087\b\u001a)\u0010a\u001a\u00020\r*\u00020\r2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140XH\u0087\bø\u0001\u0000¢\u0006\u0002\bb\u001a)\u0010a\u001a\u00020\r*\u00020\r2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020XH\u0087\bø\u0001\u0000¢\u0006\u0002\bc\u001a\"\u0010d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u0002\u001a\u001a\u0010d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u00012\u0006\u0010Z\u001a\u00020\u0002\u001a%\u0010d\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u0002H\u0087\b\u001a\u001d\u0010d\u001a\u00020\r*\u00020\r2\u0006\u0010R\u001a\u00020\u00012\u0006\u0010Z\u001a\u00020\u0002H\u0087\b\u001a=\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0@*\u00020\u00022\u0012\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0I\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010f\u001a0\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0@*\u00020\u00022\n\u0010H\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a/\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0@*\u00020\u00022\u0006\u0010U\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bg\u001a%\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0@*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a=\u0010h\u001a\b\u0012\u0004\u0012\u00020\r0>*\u00020\u00022\u0012\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0I\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010i\u001a0\u0010h\u001a\b\u0012\u0004\u0012\u00020\r0>*\u00020\u00022\n\u0010H\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a%\u0010h\u001a\b\u0012\u0004\u0012\u00020\r0>*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010j\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010j\u001a\u00020\u0010*\u00020\u00022\u0006\u0010P\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a$\u0010j\u001a\u00020\u0010*\u00020\u00022\u0006\u0010P\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010k\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u0001\u001a\u001d\u0010k\u001a\u00020\u0002*\u00020\r2\u0006\u0010l\u001a\u00020\u00062\u0006\u0010m\u001a\u00020\u0006H\u0087\b\u001a\u001f\u0010n\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0012\u0010n\u001a\u00020\r*\u00020\u00022\u0006\u0010R\u001a\u00020\u0001\u001a\u0012\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010R\u001a\u00020\u0001\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010r\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010r\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a\f\u0010s\u001a\u00020\u0010*\u00020\rH\u0007\u001a\u0013\u0010t\u001a\u0004\u0018\u00010\u0010*\u00020\rH\u0007¢\u0006\u0002\u0010u\u001a\n\u0010v\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010v\u001a\u00020\u0002*\u00020\u00022\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\u0086\bø\u0001\u0000\u001a\u0016\u0010v\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010v\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010v\u001a\u00020\r*\u00020\r2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\u0086\bø\u0001\u0000\u001a\u0016\u0010v\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010x\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010x\u001a\u00020\u0002*\u00020\u00022\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010x\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010x\u001a\u00020\r*\u00020\r2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010y\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010y\u001a\u00020\u0002*\u00020\u00022\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\u0086\bø\u0001\u0000\u001a\u0016\u0010y\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010y\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010y\u001a\u00020\r*\u00020\r2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\u0086\bø\u0001\u0000\u001a\u0016\u0010y\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006z"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", com.taobao.android.weex_framework.util.a.ATOM_lastIndex, "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "requireNonNegativeLimit", "", "limit", "commonPrefixWith", "", "other", com.taobao.android.weex_framework.util.a.ATOM_EXT_ignoreCase, "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", com.taobao.android.weex_framework.util.a.ATOM_EXT_endsWith, Constants.Name.SUFFIX, "findAnyOf", "Lkotlin/Pair;", "strings", "", k.a.PARAM_KEY_LIST_START_INDEX, com.taobao.android.weex_framework.util.a.ATOM_EXT_last, "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", com.taobao.android.weex_framework.util.a.ATOM_EXT_indexOf, "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isBlank", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "Lkotlin/collections/CharIterator;", com.taobao.android.weex_framework.util.a.ATOM_EXT_lastIndexOf, "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", com.taobao.android.weex_framework.util.a.ATOM_EXT_padEnd, com.taobao.android.weex_framework.util.a.ATOM_length, "padChar", com.taobao.android.weex_framework.util.a.ATOM_EXT_padStart, "rangesDelimitedBy", "delimiters", "", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", com.taobao.android.weex_framework.util.a.ATOM_EXT_startsWith, "subSequence", "start", "end", com.taobao.android.weex_framework.util.a.ATOM_EXT_substring, "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", com.taobao.android.weex_framework.util.a.ATOM_EXT_trimEnd, com.taobao.android.weex_framework.util.a.ATOM_EXT_trimStart, "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes9.dex */
public class x extends w {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"kotlin/text/StringsKt__StringsKt$iterator$1", "Lkotlin/collections/CharIterator;", "index", "", "hasNext", "", "nextChar", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class a extends kotlin.collections.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CharSequence f24987a;
        private int b;

        a(CharSequence charSequence) {
            this.f24987a = charSequence;
        }

        @Override // kotlin.collections.o
        public char b() {
            CharSequence charSequence = this.f24987a;
            int i = this.b;
            this.b = i + 1;
            return charSequence.charAt(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.f24987a.length();
        }
    }

    public static final int a(CharSequence charSequence, char c, int i, boolean z) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? n.a(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return n.a(charSequence, c, i, z);
    }

    private static final int a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        rwb rwbVar = !z2 ? new rwb(rwf.c(i, 0), rwf.d(i2, charSequence.length())) : rwf.a(rwf.d(i, n.e(charSequence)), rwf.c(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a2 = rwbVar.a();
            int b = rwbVar.b();
            int c = rwbVar.c();
            if ((c <= 0 || a2 > b) && (c >= 0 || b > a2)) {
                return -1;
            }
            while (!n.a(charSequence2, 0, charSequence, a2, charSequence2.length(), z)) {
                if (a2 == b) {
                    return -1;
                }
                a2 += c;
            }
            return a2;
        }
        int a3 = rwbVar.a();
        int b2 = rwbVar.b();
        int c2 = rwbVar.c();
        if ((c2 <= 0 || a3 > b2) && (c2 >= 0 || b2 > a3)) {
            return -1;
        }
        while (!n.a((String) charSequence2, 0, (String) charSequence, a3, charSequence2.length(), z)) {
            if (a3 == b2) {
                return -1;
            }
            a3 += c2;
        }
        return a3;
    }

    static /* synthetic */ int a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    public static final int a(CharSequence charSequence, String string, int i, boolean z) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(string, "string");
        return (z || !(charSequence instanceof String)) ? a(charSequence, string, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(string, i);
    }

    public static /* synthetic */ int a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return n.a(charSequence, str, i, z);
    }

    public static final int a(CharSequence charSequence, char[] chars, int i, boolean z) {
        boolean z2;
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.g.a(chars), i);
        }
        int c = rwf.c(i, 0);
        int e = n.e(charSequence);
        if (c > e) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(c);
            int length = chars.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                } else if (kotlin.text.a.a(chars[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return c;
            }
            if (c == e) {
                return -1;
            }
            c++;
        }
    }

    public static final CharSequence a(CharSequence charSequence, int i, int i2, CharSequence replacement) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(replacement, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            kotlin.jvm.internal.q.b(sb, "append(...)");
            sb.append(replacement);
            sb.append(charSequence, i2, charSequence.length());
            kotlin.jvm.internal.q.b(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    public static final String a(CharSequence charSequence, rwb range) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(range, "range");
        return charSequence.subSequence(range.f().intValue(), range.g().intValue() + 1).toString();
    }

    public static final String a(String str, char c, String missingDelimiterValue) {
        kotlin.jvm.internal.q.d(str, "<this>");
        kotlin.jvm.internal.q.d(missingDelimiterValue, "missingDelimiterValue");
        int b = n.b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(b + 1, str.length());
        kotlin.jvm.internal.q.b(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String a(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return n.a(str, c, str2);
    }

    public static final String a(String str, CharSequence suffix) {
        kotlin.jvm.internal.q.d(str, "<this>");
        kotlin.jvm.internal.q.d(suffix, "suffix");
        if (n.a((CharSequence) str, suffix, false, 2, (Object) null)) {
            String substring = str.substring(0, str.length() - suffix.length());
            kotlin.jvm.internal.q.b(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static final String a(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.q.d(str, "<this>");
        kotlin.jvm.internal.q.d(delimiter, "delimiter");
        kotlin.jvm.internal.q.d(missingDelimiterValue, "missingDelimiterValue");
        int a2 = n.a((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (a2 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, a2);
        kotlin.jvm.internal.q.b(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String a(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return n.a(str, str2, str3);
    }

    public static final String a(String str, char... chars) {
        kotlin.jvm.internal.q.d(str, "<this>");
        kotlin.jvm.internal.q.d(chars, "chars");
        String str2 = str;
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a2 = kotlin.collections.g.a(chars, str2.charAt(!z ? i : length));
            if (z) {
                if (!a2) {
                    break;
                }
                length--;
            } else if (!a2) {
                z = true;
            } else {
                i++;
            }
        }
        return str2.subSequence(i, length + 1).toString();
    }

    private static final List<String> a(CharSequence charSequence, String str, boolean z, int i) {
        n.a(i);
        int i2 = 0;
        int a2 = n.a(charSequence, str, 0, z);
        if (a2 == -1 || i == 1) {
            return kotlin.collections.p.a(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2) {
            i3 = rwf.d(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, a2).toString());
            i2 = str.length() + a2;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            a2 = n.a(charSequence, str, i2, z);
        } while (a2 != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static final List<String> a(CharSequence charSequence, char[] delimiters, boolean z, int i) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return a(charSequence, String.valueOf(delimiters[0]), z, i);
        }
        Iterable<rwb> f = kotlin.sequences.g.f(a(charSequence, delimiters, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(kotlin.collections.p.a(f, 10));
        for (rwb rwbVar : f) {
            arrayList.add(n.a(charSequence, rwbVar));
        }
        return arrayList;
    }

    public static /* synthetic */ List a(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return n.a(charSequence, cArr, z, i);
    }

    private static final kotlin.sequences.e<rwb> a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        n.a(i2);
        return new e(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$1(cArr, z));
    }

    static /* synthetic */ kotlin.sequences.e a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return a(charSequence, cArr, i, z, i2);
    }

    private static final kotlin.sequences.e<rwb> a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        n.a(i2);
        return new e(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$2(kotlin.collections.g.a(strArr), z));
    }

    static /* synthetic */ kotlin.sequences.e a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return a(charSequence, strArr, i, z, i2);
    }

    public static final kotlin.sequences.e<String> a(CharSequence charSequence, String[] delimiters, boolean z, int i) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(delimiters, "delimiters");
        return kotlin.sequences.g.c(a(charSequence, delimiters, 0, z, i, 2, (Object) null), new StringsKt__StringsKt$splitToSequence$1(charSequence));
    }

    public static /* synthetic */ kotlin.sequences.e a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return n.a(charSequence, strArr, z, i);
    }

    public static final void a(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static final boolean a(CharSequence charSequence) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!kotlin.text.a.a(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!kotlin.text.a.a(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a(CharSequence charSequence, CharSequence suffix, boolean z) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(suffix, "suffix");
        return (z || !(charSequence instanceof String) || !(suffix instanceof String)) ? n.a(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z) : n.c((String) charSequence, (String) suffix, false, 2, (Object) null);
    }

    public static /* synthetic */ boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return n.a(charSequence, charSequence2, z);
    }

    public static final int b(CharSequence charSequence, char c, int i, boolean z) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? n.b(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static /* synthetic */ int b(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = n.e(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return n.b(charSequence, c, i, z);
    }

    public static final int b(CharSequence charSequence, String string, int i, boolean z) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(string, "string");
        return (z || !(charSequence instanceof String)) ? a(charSequence, (CharSequence) string, i, 0, z, true) : ((String) charSequence).lastIndexOf(string, i);
    }

    public static /* synthetic */ int b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = n.e(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return n.b(charSequence, str, i, z);
    }

    public static final int b(CharSequence charSequence, char[] chars, int i, boolean z) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.g.a(chars), i);
        }
        for (int d = rwf.d(i, n.e(charSequence)); d >= 0; d--) {
            char charAt = charSequence.charAt(d);
            int length = chars.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (kotlin.text.a.a(chars[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return d;
            }
        }
        return -1;
    }

    public static final CharSequence b(CharSequence charSequence) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a2 = kotlin.text.a.a(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!a2) {
                    break;
                }
                length--;
            } else if (!a2) {
                z = true;
            } else {
                i++;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final String b(String str, CharSequence prefix) {
        kotlin.jvm.internal.q.d(str, "<this>");
        kotlin.jvm.internal.q.d(prefix, "prefix");
        if (n.c((CharSequence) str, prefix, false, 2, (Object) null)) {
            String substring = str.substring(prefix.length());
            kotlin.jvm.internal.q.b(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static final String b(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.q.d(str, "<this>");
        kotlin.jvm.internal.q.d(delimiter, "delimiter");
        kotlin.jvm.internal.q.d(missingDelimiterValue, "missingDelimiterValue");
        int a2 = n.a((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (a2 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(a2 + delimiter.length(), str.length());
        kotlin.jvm.internal.q.b(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String b(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return n.b(str, str2, str3);
    }

    public static final String b(String str, char... chars) {
        String str2;
        kotlin.jvm.internal.q.d(str, "<this>");
        kotlin.jvm.internal.q.d(chars, "chars");
        String str3 = str;
        int length = str3.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!kotlin.collections.g.a(chars, str3.charAt(length))) {
                    str2 = str3.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return str2.toString();
        }
        return str2.toString();
    }

    public static final List<String> b(CharSequence charSequence, String[] delimiters, boolean z, int i) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(delimiters, "delimiters");
        if (delimiters.length == 1) {
            boolean z2 = false;
            String str = delimiters[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return a(charSequence, str, z, i);
            }
        }
        Iterable<rwb> f = kotlin.sequences.g.f(a(charSequence, delimiters, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(kotlin.collections.p.a(f, 10));
        for (rwb rwbVar : f) {
            arrayList.add(n.a(charSequence, rwbVar));
        }
        return arrayList;
    }

    public static /* synthetic */ List b(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return n.b(charSequence, strArr, z, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, String> b(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        if (!z && collection.size() == 1) {
            String str = (String) kotlin.collections.p.d((Iterable<? extends Object>) collection);
            int a2 = !z2 ? n.a(charSequence, str, i, false, 4, (Object) null) : n.b(charSequence, str, i, false, 4, (Object) null);
            if (a2 >= 0) {
                return kotlin.j.a(Integer.valueOf(a2), str);
            }
            return null;
        }
        rwb rwbVar = !z2 ? new rwb(rwf.c(i, 0), charSequence.length()) : rwf.a(rwf.d(i, n.e(charSequence)), 0);
        if (charSequence instanceof String) {
            int a3 = rwbVar.a();
            int b = rwbVar.b();
            int c = rwbVar.c();
            if ((c > 0 && a3 <= b) || (c < 0 && b <= a3)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (n.a(str2, 0, (String) charSequence, a3, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (a3 == b) {
                            break;
                        }
                        a3 += c;
                    } else {
                        return kotlin.j.a(Integer.valueOf(a3), str3);
                    }
                }
            }
        } else {
            int a4 = rwbVar.a();
            int b2 = rwbVar.b();
            int c2 = rwbVar.c();
            if ((c2 > 0 && a4 <= b2) || (c2 < 0 && b2 <= a4)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (n.a(str4, 0, charSequence, a4, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (a4 == b2) {
                            break;
                        }
                        a4 += c2;
                    } else {
                        return kotlin.j.a(Integer.valueOf(a4), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final boolean b(CharSequence charSequence, CharSequence other, boolean z) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(other, "other");
        return other instanceof String ? n.a(charSequence, (String) other, 0, z, 2, (Object) null) >= 0 : a(charSequence, other, 0, charSequence.length(), z, false, 16, null) >= 0;
    }

    public static /* synthetic */ boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return n.b(charSequence, charSequence2, z);
    }

    public static final kotlin.collections.o c(CharSequence charSequence) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final boolean c(CharSequence charSequence, CharSequence prefix, boolean z) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        kotlin.jvm.internal.q.d(prefix, "prefix");
        return (z || !(charSequence instanceof String) || !(prefix instanceof String)) ? n.a(charSequence, 0, prefix, 0, prefix.length(), z) : n.b((String) charSequence, (String) prefix, false, 2, (Object) null);
    }

    public static /* synthetic */ boolean c(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return n.c(charSequence, charSequence2, z);
    }

    public static final int e(CharSequence charSequence) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final kotlin.sequences.e<String> f(CharSequence charSequence) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        return n.a(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> g(CharSequence charSequence) {
        kotlin.jvm.internal.q.d(charSequence, "<this>");
        return kotlin.sequences.g.c(n.f(charSequence));
    }
}
