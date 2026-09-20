main_menu = """
List of menu functions
1. Phone book
2. Messages
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Music 
9. Games
10. Calculator
11. Reminders
12. Clock
13. Profiles
14. Services
15. SIM services
"""
print(main_menu)
main_menu_choice = int(input())
match(main_menu_choice):
	case 1: print("Phone book")
	default_: print("Invalid input")
