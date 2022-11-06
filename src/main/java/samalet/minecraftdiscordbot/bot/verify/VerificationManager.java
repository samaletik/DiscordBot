package samalet.minecraftdiscordbot.bot.verify;

import org.jetbrains.annotations.Nullable;
import samalet.minecraftdiscordbot.bot.Bot;
import samalet.minecraftdiscordbot.data.Database;

import java.util.UUID;

public class VerificationManager {

    @Nullable
    public static Request createRequest(UUID requester, String requestedDiscordId) {
        if (!Bot.getInstance().isUserOnServer(requestedDiscordId)) {
            return null;
        }

        return new Request(requester, requestedDiscordId);
    }


    public static class Request {
        private final UUID requester;
        private final String requestedDiscordId;

        private Request(UUID requester, String requestedDiscordId) {
            this.requester = requester;
            this.requestedDiscordId = requestedDiscordId;
        }

        public UUID getRequester() {
            return requester;
        }

        public String getRequestedDiscordId() {
            return requestedDiscordId;
        }
    }
}
