//package by.oris.game.webmafia.test;
//
//import by.oris.game.webmafia.model.entities.ingame.*;
//import by.oris.game.webmafia.model.entities.outgame.*;
//import by.oris.game.webmafia.service.impl.ingame.*;
//import by.oris.game.webmafia.service.impl.outgame.FriendshipServiceImpl;
//import by.oris.game.webmafia.service.impl.outgame.StatServiceImpl;
//import by.oris.game.webmafia.service.impl.outgame.UserRoleServiceImpl;
//import by.oris.game.webmafia.service.impl.outgame.UserServiceImpl;
//import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Controller
//public class AddAllEntitiesToDB {
//    private UserRoleServiceImpl userRoleService;
//    private GameRoleServiceImlp gameRoleService;
//    private GameServiceImpl gameService;
//    private MoveServiceImpl moveService;
//    private PlayerServiceImpl playerService;
//    private StageServiceImpl stageService;
//    private VoteResultServiceImpl voteResultService;
//    private FriendshipServiceImpl friendshipService;
//    private StatServiceImpl statService;
//    private UserServiceImpl userService;
//
//    public AddAllEntitiesToDB(UserRoleServiceImpl userRoleService, GameRoleServiceImlp gameRoleService,
//                              GameServiceImpl gameService, MoveServiceImpl moveService,
//                              PlayerServiceImpl playerService, StageServiceImpl stageService,
//                              VoteResultServiceImpl voteResultService, FriendshipServiceImpl friendshipService,
//                              StatServiceImpl statService, UserServiceImpl userService) {
//        this.userRoleService = userRoleService;
//        this.gameRoleService = gameRoleService;
//        this.gameService = gameService;
//        this.moveService = moveService;
//        this.playerService = playerService;
//        this.stageService = stageService;
//        this.voteResultService = voteResultService;
//        this.friendshipService = friendshipService;
//        this.statService = statService;
//        this.userService = userService;
//    }
//
//    @Transactional
//    public void allEntitiesToDb() {
//        UserRole userRole = new UserRole();
//        userRole.setName("user");
//
//
////
////        User user1 = new User();
////        user1.setName("Bob");
////        user1.setEmail("bob@gmail.com");
////        user1.setPassword("asdvxcvhn23");
////        user1.setProfilePictureURL("/bobik");
////        user1.setUserRole(userRoleService.findById(1));
////        userService.create(user1);
////
////        Set<User> users = new HashSet<>();
////        users.add(userService.findById(1));
////        userRole.setUsers(users);
////        userRoleService.update(userRole);
//
//        User user1 = new User();
//        user1.setUsername("Bob");
//        user1.setEmail("bob@gmail.com");
//        user1.setPassword("asdvxcvhn23");
//        user1.setProfilePictureURL("/bobik");
//        user1.setUserRole(userRole);
//
//        User user2 = new User();
//        user2.setUsername("Jack");
//        user2.setEmail("jack@gmail.com");
//        user2.setPassword("123");
//        user2.setProfilePictureURL("/jack");
//        user2.setUserRole(userRole);
//
//        User user3 = new User();
//        user3.setUsername("Kevin");
//        user3.setEmail("kevin@gmail.com");
//        user3.setPassword("441");
//        user3.setProfilePictureURL("/kevin");
//        user3.setUserRole(userRole);
//
//        User user4 = new User();
//        user4.setUsername("Lupik");
//        user4.setEmail("lupik@gmail.com");
//        user4.setPassword("gcv123");
//        user4.setProfilePictureURL("/lupik");
//        user4.setUserRole(userRole);
//
//        User user5 = new User();
//        user5.setUsername("John");
//        user5.setEmail("john@gmail.com");
//        user5.setPassword("vvcsa");
//        user5.setProfilePictureURL("/jjj");
//        user5.setUserRole(userRole);
//
//        User user6 = new User();
//        user6.setUsername("LosPol");
//        user6.setEmail("los@gmail.com");
//        user6.setPassword("pol");
//        user6.setProfilePictureURL("/pol");
//        user6.setUserRole(userRole);
//
//        Set<User> users = new HashSet<>();
//
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        users.add(user5);
//        users.add(user6);
//
//        userRole.setUsers(users);
//
//        Stat stat1 = new Stat();
//        stat1.setGamesPlayed(12);
//        stat1.setCivilWins(5);
//        stat1.setMafiaWins(7);
//        stat1.setUser(user1);
//        user1.setStat(stat1);
//
//        Stat stat2 = new Stat();
//        stat2.setGamesPlayed(77);
//        stat2.setCivilWins(3);
//        stat2.setMafiaWins(35);
//        stat2.setUser(user2);
//        user2.setStat(stat2);
//
//        Stat stat3 = new Stat();
//        stat3.setGamesPlayed(86);
//        stat3.setCivilWins(34);
//        stat3.setMafiaWins(4);
//        stat3.setUser(user3);
//        user3.setStat(stat3);
//
//        Stat stat4 = new Stat();
//        stat4.setGamesPlayed(123);
//        stat4.setCivilWins(54);
//        stat4.setMafiaWins(7);
//        stat4.setUser(user4);
//        user4.setStat(stat4);
//
//        Stat stat5 = new Stat();
//        stat5.setGamesPlayed(43);
//        stat5.setCivilWins(15);
//        stat5.setMafiaWins(7);
//        stat5.setUser(user5);
//        user5.setStat(stat5);
//
//        Stat stat6 = new Stat();
//        stat6.setGamesPlayed(23);
//        stat6.setCivilWins(5);
//        stat6.setMafiaWins(1);
//        stat6.setUser(user6);
//        user6.setStat(stat6);
//
//        Friendship friendship = new Friendship();
//        FriendshipPK friendshipPK = new FriendshipPK();
//        friendshipPK.setUserId1(user3.getId());
//        friendshipPK.setUserId2(user1.getId());
//        friendship.setId(friendshipPK);
//        friendship.setUsers1(user3);
//        friendship.setUsers2(user1);
//        friendship.setStatus("approved");
//        Set<Friendship> friendshipSet = new HashSet<>();
//
//        friendshipSet.add(friendship);
//        user3.setFriendships(friendshipSet);
//        user1.setFriendships(friendshipSet);
//
//        Game game = new Game();
//        game.setStatus("ended");
//        game.setResult("civil_won");
//
//        GameRole gameRole1 = new GameRole();
//        gameRole1.setName("civil");
//        GameRole gameRole2 = new GameRole();
//        gameRole2.setName("mafia");
//
//        Player player1 = new Player();
//        player1.setGame(game);
//        player1.setUser(user1);
//        user1.setPlayer(player1);
//        player1.setGameRole(gameRole1);
//        player1.setCardUrl("/civil");
//        player1.setAlive(false);
//        player1.setOnline(true);
//
//        Player player2 = new Player();
//        player2.setGame(game);
//        player2.setUser(user2);
//        user2.setPlayer(player2);
//        player2.setGameRole(gameRole1);
//        player2.setCardUrl("/civil");
//        player2.setAlive(false);
//        player2.setOnline(false);
//
//        Player player3 = new Player();
//        player3.setGame(game);
//        player3.setUser(user3);
//        user3.setPlayer(player3);
//        player3.setGameRole(gameRole2);
//        player3.setCardUrl("/mafia");
//        player3.setAlive(false);
//        player3.setOnline(true);
//
//        Player player4 = new Player();
//        player4.setGame(game);
//        player4.setUser(user4);
//        user4.setPlayer(player4);
//        player4.setGameRole(gameRole1);
//        player4.setCardUrl("/civil");
//        player4.setAlive(false);
//        player4.setOnline(true);
//
//        Player player5 = new Player();
//        player5.setGame(game);
//        player5.setUser(user5);
//        user5.setPlayer(player5);
//        player5.setGameRole(gameRole2);
//        player5.setCardUrl("/mafia");
//        player5.setAlive(false);
//        player5.setOnline(false);
//
//        Player player6 = new Player();
//        player6.setGame(game);
//        player6.setUser(user6);
//        user6.setPlayer(player6);
//        player6.setGameRole(gameRole1);
//        player6.setCardUrl("/civil");
//        player6.setAlive(false);
//        player6.setOnline(false);
//
//        Set<Player> civilPlayers = new HashSet<>();
//        civilPlayers.add(player1);
//        civilPlayers.add(player2);
//        civilPlayers.add(player4);
//        civilPlayers.add(player6);
//
//        gameRole1.setPlayers(civilPlayers);
//
//        Set<Player> mafiaPlayers = new HashSet<>();
//        civilPlayers.add(player3);
//        civilPlayers.add(player5);
//
//        gameRole2.setPlayers(mafiaPlayers);
//
//        Stage stage1 = new Stage();
//        stage1.setGame(game);
//        stage1.setName("night_discuss");
//        stage1.setTime("30");
//
//        Stage stage2 = new Stage();
//        stage2.setGame(game);
//        stage2.setName("night_vote");
//        stage2.setTime("20");
//
//        Stage stage3 = new Stage();
//        stage3.setGame(game);
//        stage3.setName("day_discuss");
//        stage3.setTime("60");
//
//        Stage stage4 = new Stage();
//        stage4.setGame(game);
//        stage4.setName("day_vote");
//        stage4.setTime("30");
//
//        Stage stage5 = new Stage();
//        stage5.setGame(game);
//        stage5.setName("night_discuss");
//        stage5.setTime("30");
//
//        Stage stage6 = new Stage();
//        stage6.setGame(game);
//        stage6.setName("night_vote");
//        stage6.setTime("20");
//
//        Stage stage7 = new Stage();
//        stage7.setGame(game);
//        stage7.setName("day_discuss");
//        stage7.setTime("60");
//
//        Stage stage8 = new Stage();
//        stage8.setGame(game);
//        stage8.setName("day_vote");
//        stage8.setTime("30");
//
//        VoteResult voteResult1 = new VoteResult();
//        VoteResultPK voteResultPK1 = new VoteResultPK();
//        voteResultPK1.setPlayerId(player2.getId());
//        voteResultPK1.setStageId(stage2.getId());
//        voteResult1.setId(voteResultPK1);
//        voteResult1.setStage(stage2);
//        voteResult1.setPlayer(player2);
//        stage2.setVoteResult(voteResult1);
//        player2.setVoteResult(voteResult1);
//
//        VoteResult voteResult2 = new VoteResult();
//        VoteResultPK voteResultPK2 = new VoteResultPK();
//        voteResultPK2.setPlayerId(player5.getId());
//        voteResultPK2.setStageId(stage4.getId());
//        voteResult2.setId(voteResultPK2);
//        voteResult2.setStage(stage4);
//        voteResult2.setPlayer(player5);
//        stage4.setVoteResult(voteResult2);
//        player4.setVoteResult(voteResult2);
//
//        VoteResult voteResult3 = new VoteResult();
//        VoteResultPK voteResultPK3 = new VoteResultPK();
//        voteResultPK3.setPlayerId(player1.getId());
//        voteResultPK3.setStageId(stage6.getId());
//        voteResult3.setId(voteResultPK3);
//        voteResult3.setStage(stage6);
//        voteResult3.setPlayer(player1);
//        stage6.setVoteResult(voteResult3);
//        player1.setVoteResult(voteResult3);
//
//        VoteResult voteResult4 = new VoteResult();
//        VoteResultPK voteResultPK4 = new VoteResultPK();
//        voteResultPK4.setPlayerId(player3.getId());
//        voteResultPK4.setStageId(stage8.getId());
//        voteResult4.setId(voteResultPK4);
//        voteResult4.setStage(stage8);
//        voteResult4.setPlayer(player3);
//        stage8.setVoteResult(voteResult4);
//        player3.setVoteResult(voteResult4);
//
//        Set<Move> movePlayer1 = new HashSet<>();
//        Set<Move> movePlayer2 = new HashSet<>();
//        Set<Move> movePlayer3 = new HashSet<>();
//        Set<Move> movePlayer4 = new HashSet<>();
//        Set<Move> movePlayer5 = new HashSet<>();
//        Set<Move> movePlayer6 = new HashSet<>();
//
//        Set<Move> moveStage2 = new HashSet<>();
//        Set<Move> moveStage4 = new HashSet<>();
//        Set<Move> moveStage6 = new HashSet<>();
//        Set<Move> moveStage8 = new HashSet<>();
//
//        Move move1 = new Move();
//        move1.setName("kill_vote");
//        move1.setStage(stage2);
//        move1.setPlayer1(player3);
//        move1.setPlayer2(player2);
//        movePlayer3.add(move1);
//        moveStage2.add(move1);
//
//        Move move2 = new Move();
//        move2.setName("kill_vote");
//        move2.setStage(stage2);
//        move2.setPlayer1(player5);
//        move2.setPlayer2(player4);
//        movePlayer5.add(move2);
//        moveStage2.add(move2);
//
//        Move move3 = new Move();
//        move3.setName("vote");
//        move3.setStage(stage4);
//        move3.setPlayer1(player1);
//        move3.setPlayer2(player5);
//        movePlayer1.add(move3);
//        moveStage4.add(move3);
//
//        Move move4 = new Move();
//        move4.setName("vote");
//        move4.setStage(stage4);
//        move4.setPlayer1(player3);
//        move4.setPlayer2(player1);
//        movePlayer3.add(move4);
//        moveStage4.add(move4);
//
//        Move move5 = new Move();
//        move5.setName("vote");
//        move5.setStage(stage4);
//        move5.setPlayer1(player4);
//        move5.setPlayer2(player5);
//        movePlayer4.add(move5);
//        moveStage4.add(move5);
//
//        Move move6 = new Move();
//        move6.setName("vote");
//        move6.setStage(stage4);
//        move6.setPlayer1(player5);
//        move6.setPlayer2(player1);
//        movePlayer5.add(move6);
//        moveStage4.add(move6);
//
//        Move move7 = new Move();
//        move7.setName("vote");
//        move7.setStage(stage4);
//        move7.setPlayer1(player6);
//        move7.setPlayer2(player5);
//        movePlayer6.add(move7);
//        moveStage4.add(move7);
//
//        Move move8 = new Move();
//        move8.setName("kill_vote");
//        move8.setStage(stage6);
//        move8.setPlayer1(player3);
//        move8.setPlayer2(player1);
//        movePlayer3.add(move8);
//        moveStage6.add(move8);
//
//        Move move9 = new Move();
//        move9.setName("vote");
//        move9.setStage(stage8);
//        move9.setPlayer1(player3);
//        move9.setPlayer2(player4);
//        movePlayer3.add(move9);
//        moveStage8.add(move9);
//
//        Move move10 = new Move();
//        move10.setName("vote");
//        move10.setStage(stage8);
//        move10.setPlayer1(player4);
//        move10.setPlayer2(player3);
//        movePlayer4.add(move10);
//        moveStage8.add(move10);
//
//        Move move11 = new Move();
//        move11.setName("vote");
//        move11.setStage(stage8);
//        move11.setPlayer1(player6);
//        move11.setPlayer2(player3);
//        movePlayer6.add(move11);
//        moveStage8.add(move11);
//
//        userRoleService.save(userRole);
//
//        userService.save(user1);
//        userService.save(user2);
//        userService.save(user3);
//        userService.save(user4);
//        userService.save(user5);
//        userService.save(user6);
//
//        statService.save(stat1);
//        statService.save(stat2);
//        statService.save(stat3);
//        statService.save(stat4);
//        statService.save(stat5);
//        statService.save(stat6);
//
//        gameRoleService.save(gameRole1);
//        gameRoleService.save(gameRole2);
//
//        gameService.save(game);
//
//        playerService.save(player1);
//        playerService.save(player2);
//        playerService.save(player3);
//        playerService.save(player4);
//        playerService.save(player5);
//        playerService.save(player6);
//
//        stageService.save(stage1);
//        stageService.save(stage2);
//        stageService.save(stage3);
//        stageService.save(stage4);
//        stageService.save(stage5);
//        stageService.save(stage6);
//        stageService.save(stage7);
//        stageService.save(stage8);
//
//        moveService.save(move1);
//        moveService.save(move2);
//        moveService.save(move3);
//        moveService.save(move4);
//        moveService.save(move5);
//        moveService.save(move6);
//        moveService.save(move7);
//        moveService.save(move8);
//        moveService.save(move9);
//        moveService.save(move10);
//        moveService.save(move11);
//
//        friendshipService.save(friendship);
//
//        voteResultService.save(voteResult1);
//        voteResultService.save(voteResult2);
//        voteResultService.save(voteResult3);
//        voteResultService.save(voteResult4);
//    }
//}
