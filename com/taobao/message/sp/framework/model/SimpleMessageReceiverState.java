package com.taobao.message.sp.framework.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleMessageReceiverState implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MessageReceiverStateItem unread = new MessageReceiverStateItem(0, false);
    private MessageReceiverStateItem read = new MessageReceiverStateItem(0, false);

    static {
        kge.a(1641276219);
        kge.a(1028243835);
    }

    public MessageReceiverStateItem getUnread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MessageReceiverStateItem) ipChange.ipc$dispatch("5f510f06", new Object[]{this}) : this.unread;
    }

    public void setUnread(MessageReceiverStateItem messageReceiverStateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc9db32", new Object[]{this, messageReceiverStateItem});
        } else {
            this.unread = messageReceiverStateItem;
        }
    }

    public MessageReceiverStateItem getRead() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MessageReceiverStateItem) ipChange.ipc$dispatch("9a2d42d", new Object[]{this}) : this.read;
    }

    public void setRead(MessageReceiverStateItem messageReceiverStateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1140c7eb", new Object[]{this, messageReceiverStateItem});
        } else {
            this.read = messageReceiverStateItem;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MessageReceiverState{unread=" + this.unread + ", read=" + this.read + '}';
    }

    /* loaded from: classes7.dex */
    public class MessageReceiverStateItem implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean all;
        private int count;

        static {
            kge.a(-950336969);
            kge.a(1028243835);
        }

        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.count;
        }

        public void setCount(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbdc85af", new Object[]{this, new Integer(i)});
            } else {
                this.count = i;
            }
        }

        public boolean isAll() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a7008d22", new Object[]{this})).booleanValue() : this.all;
        }

        public void setAll(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("deecc0ae", new Object[]{this, new Boolean(z)});
            } else {
                this.all = z;
            }
        }

        public MessageReceiverStateItem() {
        }

        public MessageReceiverStateItem(int i, boolean z) {
            this.count = 0;
            this.all = z;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MessageReceiverStateItem{count=" + this.count + ", all=" + this.all + '}';
        }
    }
}
