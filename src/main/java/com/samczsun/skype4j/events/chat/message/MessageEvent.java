/*
 * Copyright 2015 Sam Sun <me@samczsun.com>
 *
 * This file is part of Skype4J.
 *
 * Skype4J is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * Skype4J is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Skype4J.
 * If not, see http://www.gnu.org/licenses/.
 */

package com.samczsun.skype4j.events.chat.message;

import com.samczsun.skype4j.chat.messages.ChatMessage;
import com.samczsun.skype4j.events.chat.ChatEvent;

public abstract class MessageEvent extends ChatEvent {
    private final ChatMessage message;

    public MessageEvent(ChatMessage message) {
        super(message.getChat());
        this.message = message;
    }

    public ChatMessage getMessage() {
        return this.message;
    }
}
